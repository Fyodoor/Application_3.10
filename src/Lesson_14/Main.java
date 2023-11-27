package Lesson_14;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before calling method run");
        FirstRunner firstRunner = new FirstRunner();
        firstRunner.start();


        Thread secondRunner = new Thread(new SecondRunner());
        secondRunner.start();

        System.out.println("After calling method run");


    }


}

class FirstRunner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 is printing " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SecondRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 is printing " + i);

        }
    }
}