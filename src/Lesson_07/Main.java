package Lesson_07;

import Lesson_06.animals.Animal;
import Lesson_06.animals.Cat;
import Lesson_06.animals.Dog;

public class Main {
    public static void main(String[] args) {
        // Восходящие преобразование
        // Upcasting
        Animal animal = new Cat();


        Cat cat = new Cat();
        Dog dog = new Dog();

        doSomething(dog);
        doSomething(cat);
    }

    public static void doSomething(Object object){
        // Нисходящие преобразование
        // Downcasting

        if (object instanceof Cat) {
            Cat cat = (Cat) object;
            cat.sleep();
        } else if (object instanceof Dog) {
            Dog dog = (Dog) object;
            dog.walk();
        }

    }
}
