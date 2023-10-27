package Lesson_06.HomeWork;

public class Human {
//      Создать класс Human.
//      • Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//      • Добавить в класс конструктор public Human(String name, boolean sex, int age).
//      • Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//      • Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//      • Выведи созданные объекты на экран

    //• Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human() {

    }

    //• Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    //• Добавить в класс конструктор public Human(String name, boolean sex, int age).
    public Human(String name, boolean sex, int age) {
        this(name, sex, age, null, null);
    }
    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.father != null) {
            text += ", отец: " + this.father.name;
        }

        if (this.mother != null) {
            text += ", мать: " + this.mother.name;
        }

        return text;
    }
}

class HomeWork {

    public static void main(String[] args) {
        //• Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).

        Human father = new Human("Boris", true, 57);
        Human mother = new Human("Zinaida", false, 50);
        Human father1 = new Human("Petr", true, 40);
        Human mother1 = new Human("Vasilisa", false, 41);

        Human human1 = new Human("Volja", true, 15, father1, mother1);
        Human human2 = new Human("Vitja", true, 18, father, mother);
        Human human3 = new Human("Olga", false, 20, father, mother);
        Human human4 = new Human("Nikita", true, 23, father, mother);
        Human human5 = new Human("Kseniya", false, 13, father1, mother1);

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(father1.toString());
        System.out.println(mother1.toString());
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
    }
}
