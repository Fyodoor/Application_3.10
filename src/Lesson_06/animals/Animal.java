package Lesson_06.animals;

import Lesson_08.singleton.Cat;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("My name is + " + name);
    }

    public void eat(){
        System.out.println("I'm eatering...");
    }

    public void makeNoise() {
        System.out.println("The animal is making some noise");
    }

    public void printCatName(){
        Cat cat = Cat.getCat();
        System.out.println("Imja cata iz animal " + cat.getName());
    }
}
