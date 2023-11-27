package Lesson_14;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();

    }
}

class Runner {
    Random random = new Random();
    private Accaunt accaunt1 = new Accaunt();
    private Accaunt accaunt2 = new Accaunt();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void takeLocks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while(true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }
    }
    public void firstThread() {
        for (int i = 0; i < 10000; i++) {
//            synchronized (accaunt1){
//                synchronized (accaunt2) {
//                    Accaunt.transfer(accaunt1, accaunt2, random.nextInt(100));
//                }
//            }
            takeLocks(lock1, lock2);
            try {
                Accaunt.transfer(accaunt1, accaunt2, random.nextInt(100));

            } finally {
                lock1.unlock();
                lock2.unlock();
            }


        }
    }

    public  void secondThread() {
        for (int i = 0; i < 10000; i++) {
//            synchronized (accaunt1) {
//                synchronized (accaunt2) {
//                    Accaunt.transfer(accaunt2, accaunt1, random.nextInt(100));
//                }
//            }
            takeLocks(lock2, lock1);
            try {

                Accaunt.transfer(accaunt2, accaunt1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println("Balance 1st scheta " + accaunt1.getBalance());
        System.out.println("Balance 2st scheta " + accaunt2.getBalance());
        System.out.println("Total balance of both accounts is " + (accaunt1.getBalance() + accaunt2.getBalance()));
    }
}

class Accaunt {
    private int balance = 10000;

    public void addToDeposit(int amount) {
        balance += amount;
    }

    public void withDraw(int amount) {
        balance -= amount;
    }

    public static void transfer(Accaunt acct1, Accaunt acct2, int amount) {
        acct1.withDraw(amount);
        acct2.addToDeposit(amount);
    }


    public int getBalance() {
        return balance;
    }
}
