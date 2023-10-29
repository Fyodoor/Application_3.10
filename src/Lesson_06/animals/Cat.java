package Lesson_06.animals;

public class Cat extends Animal{
    private String catName;
    public Cat(String name, String catName) {
        super(name);
        this.catName = catName;
    }

    public Cat() {

    }

    public void sleep(){
        System.out.println("I'm sleeping...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is saying mew...");
    }
}
