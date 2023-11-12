package Lesson_06.HomeWork_26_10.Task4;

public class Main {
    public static void main(String[] args) {
//        4 Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//        Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
//        Вывести объекты на экран.
//        Примечание:
//        Если написать свой метод String toString() в классе Human,
//        то именно он будет использоваться при выводе объекта на экран.
//        Пример вывода:
//        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//        Имя: Катя, пол: женский, возраст: 55
//        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня

        Human grandFather1 = new Human("Светослав", true, 79);
        Human grandFather2 = new Human("Ярослав", true, 85);
        Human grandMother1 = new Human("Трактарина", false, 77);
        Human grandMother2 = new Human("Зинаида", false, 80);
        Human father = new Human("Григорий", true, 50, grandFather1, grandMother1);
        Human mother = new Human("Рая", false, 45, grandFather2, grandMother2);
        Human children1 = new Human("Анастасия", false, 20, father, mother);
        Human children2 = new Human("Никита", true, 16, father,mother);
        Human children3 = new Human("Вечяслав", true, 10, father,mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());




    }
}
