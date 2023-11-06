package Lesson_08;

import Lesson_06.animals.Animal;
import Lesson_08.singleton.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();

        System.out.println(cat);
        System.out.println(cat.getName());

        Animal animal = new Animal();
        animal.printCatName();
    }
}
