package Lesson_06.animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Parent animal");
        animal.sayHello();

        Cat cat = new Cat();
        cat.eat();
        cat.makeNoise();
    }
}
