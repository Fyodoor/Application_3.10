package Lesson_06.HomeWork_26_10.Task3;
public class Main {
    public static void main(String[] args) {
//        3
//        Создать класс Person, который содержит:
//        переменные fullName, age;
//        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
//        Добавьте два конструктора  - Person() и Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
//        другой - Person(fullName, age).

        Person inkognito = new Person();
        Person benTen = new Person("Бен Тэн", 10);

        Person.move(inkognito);
        Person.talk(inkognito);

        Person.move(benTen);
        Person.talk(benTen);


    }
}
