package Lesson_06.HomeWork_26_10.animal;

public class Cat extends Animal{
    private String life;
    @Override
    public void makeNoise() {
        System.out.println("Cat noise - meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats - sour cream");
    }
}
