package Lesson_13;

interface Executable {
    void printHello();
}

class Printer {
    public void print(Executable e) {
        e.printHello();
    }
}

class ExecutableImpl implements Executable {

    @Override
    public void printHello() {
        System.out.println("Hello World");
    }
}
public class TestMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(new ExecutableImpl());

        printer.print(new Executable() {
            @Override
            public void printHello() {
                System.out.println("Hello world!");
            }
        });

        printer.print(() -> System.out.println("Hello World"));
    }
}
