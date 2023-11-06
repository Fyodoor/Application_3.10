package Lesson_06.HomeWork_26_10.animal;

public class Dog extends Animal{
    private String countsBone;
    @Override
    public void makeNoise() {
        System.out.println("Dog noise - gav gav");
    }

    @Override
    public void eat() {
        System.out.println("Dog east - that's it");
    }
}
