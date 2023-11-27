package Lesson_13;

interface Executable2 {
    void printHello(int x);
}

class Printer2 {
    public void print(Executable2 e) {
        e.printHello(10);
    }
}

class ExecutableImpl2 implements Executable2 {


    @Override
    public void printHello(int x) {
        System.out.println(x);
    }
}

public class TestMain2 {
    public static void main(String[] args) {
        Printer2 printer2 = new Printer2();
        printer2.print(new ExecutableImpl2());

        printer2.print(new Executable2() {
            @Override
            public void printHello(int x) {
                System.out.println(x + 5);
            }
        });

        printer2.print(x -> System.out.println(x + 10));
    }
}
