package Lesson_13;

interface Executable1 {
    int printHello();
}

class Printer1 {
    public void print(Executable1 e) {
        int a = e.printHello();
        System.out.println(a);
    }
}

class ExecutableImpl1 implements Executable1 {

    @Override
    public int printHello() {
        return 1;
    }
}

public class TestMain1 {
    public static void main(String[] args) {
        Printer1 printer1 = new Printer1();
        printer1.print(new ExecutableImpl1());

        printer1.print(new Executable1() {
            @Override
            public int printHello() {
                return 2;
            }
        });

        printer1.print(() -> 3);
    }
}