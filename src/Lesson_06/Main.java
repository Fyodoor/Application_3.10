package Lesson_06;

public class Main {
    public static void main(String[] args) {
        Cat snezhok = new Cat();
        snezhok.setName("Snezhok");
        snezhok.setAge(5);
        snezhok.setBreed("Siam cat");
        snezhok.setColor("Black");

        System.out.println("I have cat. His name is " + snezhok.getName());
        System.out.println("Hes age is " + snezhok.getAge());
        System.out.println("His breed is " + snezhok.getBreed());
        System.out.println("Hi is " + snezhok.color);
        snezhok.printName();
    }
}
