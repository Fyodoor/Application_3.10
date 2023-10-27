package Lesson_06.HomeWork;

public class Solution {
//            3
//
//            1. Внутри класса Solution создай public static классы Man и Woman.
//            2. У классов должны быть поля: name (String), age (int), address (String).
//            3. Создай конструкторы, в которые передаются все возможные параметры.
//            4. Создай по два объекта каждого класса со всеми данными используя конструктор.
//            5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
//
//            В этой задаче можно создавать static class внутри основного класса

    String name;
    int age;
    String address;

    @Override
    public String toString() {
        String text = "";
        text += "" + this.name;
        text += " " + this.age;
        text += " " + this.address;
        return text;
    }

    public static class Man extends Solution{
        Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        Man(String name){
            this(name, 0, null);
        }
        Man(String name, int age){
            this(name, age, null);
        }
        Man(int age, String adress) {
            this(null, age, adress);
        }
        Man(int age){
            this(null,age,null);
        }
        Man(String name,String adress){
            this(name, 0, adress);
        }

    }
    public static class Woman extends Solution{
        Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        Woman(String name){
            this(name, 0, null);
        }
        Woman(String name, int age){
            this(name, age, null);
        }
        Woman(int age, String adress) {
            this(null, age, adress);
        }
        Woman(int age){
            this(null,age,null);
        }
        Woman(String name,String adress){
            this(name, 0, adress);
        }

    }

    public static void main(String[] args) {
        Woman tanya = new Woman("Wera", 13, "ul. Kolovodjkino");
        Woman olga = new Woman("Olga", 20, "ul. Restorannaja");

        Man pasha = new Man("Pavel", 30, "ul. Restorannaja");
        Man vitya = new Man("Vitaliy", 15, "ul. Kolovodjkino");

        System.out.println(tanya.toString());
        System.out.println(olga.toString());
        System.out.println(pasha.toString());
        System.out.println(vitya.toString());

    }
}
