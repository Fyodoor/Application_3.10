package Lesson_06.HomeWork;

public class Cat {
    //home work 23.10
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
    private double weight;
    private int age;
    private String address = "Бездомный";
    private String color;

    //Создать класс Cat (кот) с пятью конструкторами:
    // -Имя,
    Cat(String name) {
        setName(name);
    }
    // - Имя, вес, возраст
    Cat(String name, double weight, int age) {
        this(name);
        setWeight(weight);
        setAge(age);
    }
    // - Имя, возраст (вес стандартный)
    Cat(String name, int age) {
        this(name, 0,age);
    }
    //- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
    Cat(double weight, String color) {
        this(null,weight,0);
        setColor(color);
    }

    //- вес, цвет, адрес (чужой домашний кот)
    Cat(double weight, String color, String address) {
        this(weight, color);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 1.5 || weight == 0) {
            weight = 2;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 || age == 0){
            age = 1;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank()){
            color = "Kakoi-to cvet";
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", address=" + address +
                ", color='" + color + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Snezhok");
        System.out.println(cat.toString());
    }
}
