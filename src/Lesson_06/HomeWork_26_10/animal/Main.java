package Lesson_06.HomeWork_26_10.animal;

import Lesson_06.HomeWork_26_10.animal.*;

public class Main {
    public static void main(String[] args) {
//        1
//
//        Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
//        Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод распечатывает food и location пришедшего на прием животного.
//        В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//        В цикле отправляйте их на прием к ветеринару.

        Cat cat = new Cat();
        cat.setFood("Milk");
        cat.setLocation("Ugol kraja na granice mira");
//        cat.makeNoise();
//        cat.eat();
//        System.out.println();

        Dog dog = new Dog();
        dog.setFood("Meat");
        dog.setLocation("Budka");
//        dog.makeNoise();
//        dog.eat();
//        System.out.println();

        Horse horse = new Horse();
        horse.setFood("hay");
        horse.setLocation("Ferma");
//        horse.makeNoise();
//        horse.eat();
//        System.out.println();

        Animal [] zoopark = new Animal[3];
        zoopark[0] = cat;
        zoopark[1] = dog;
        zoopark[2] = horse;

        for (int i = 0; i < zoopark.length; i++) {
            Veterenar.treatAnimal(zoopark[i]);
        }
    }
}
