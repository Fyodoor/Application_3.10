package Lesson_06.HomeWork_26_10.Task3;

public class Person {
    private String fullName = "Безымянный";
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        setFullName(fullName);
        setAge(age);
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void move(Person person) {
        System.out.println(person.getFullName() + " куда-то идёт");
    }
    public static void talk(Person person) {
        System.out.println(person.getFullName() + " что-то говорит");
    }
}
