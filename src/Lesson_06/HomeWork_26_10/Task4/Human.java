package Lesson_06.HomeWork_26_10.Task4;

public class Human {
    //        4 Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        setName(name);
        setAge(age);
        setSex(sex);
        setFather(father);
        setMother(mother);
    }

    public Human(String name, boolean sex, int age) {
        this(name, sex, age, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
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
