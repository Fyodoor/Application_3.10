package Lesson_06.HomeWork_26_10.animal;

public class Horse extends Animal{
    private String griva;
    @Override
    public void makeNoise() {
        System.out.println("Horse noise - igogoing");
    }

    @Override
    public void eat() {
        System.out.println("Horse east hay");
    }
}
