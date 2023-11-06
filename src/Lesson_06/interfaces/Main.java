package Lesson_06.interfaces;

public class Main {
    public static void main(String[] args) {
        HumanInterface human = new OldMan();
        System.out.println("Oldman is running " + human.run() + " metrs");
        human = new Children();
        System.out.println(human.maxOfLifeInYears());
        System.out.println("Children is running " + human.run() + " metrs");

    }
}
