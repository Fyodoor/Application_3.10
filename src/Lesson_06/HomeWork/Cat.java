package Lesson_06.HomeWork;

public class Cat {
//    2
//
//    Создать класс Cat (кот) с пятью конструкторами:
//     - Имя,
//     - Имя, вес, возраст
//     - Имя, возраст (вес стандартный)
//     - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
//     - вес, цвет, адрес (чужой домашний кот)
//
//    Задача конструктора - сделать объект валидным.
//    Например, если вес не известен, то нужно указать какой-нибудь средний вес.
//    Кот не может ничего не весить.
//    То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

    private String name;
    private double weight = 1.4;
    private int age = 3;
    private boolean adress;
    private String color;

    //Создать класс Cat (кот) с пятью конструкторами:
    // -Имя,
    Cat(String name) {
        this.name = name;
    }
    // - Имя, вес, возраст
    Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    // - Имя, возраст (вес стандартный)
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
        if (weight == 0){
            weight = 1.5;
        }
    }
    //- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
    Cat(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    //- вес, цвет, адрес (чужой домашний кот)
    Cat(double weight, String color, boolean adress) {
        this.weight = weight;
        this.color = color;
    }

}
