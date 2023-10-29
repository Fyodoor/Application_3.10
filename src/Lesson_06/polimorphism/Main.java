package Lesson_06.polimorphism;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

        Animal animal = new Cat();
        animal.eat();
    }
}
