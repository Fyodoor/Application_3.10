package Lesson_07;

import Lesson_06.animals.Dog;

public class Initialization {
    public static void main(String[] args) {
        String italianDog = Dog.italianName;
        System.out.println(italianDog);

        double random = Algebra.randomDouble();
        System.out.println(random);

        Algebra algebra = new Algebra();
        System.out.println(algebra.getPi());

        String email = "test@mail.ru";
        if(Util.check(email)) {
            System.out.println(email);
        } else {
            return;
        }

        String newHello = algebra.hello + " from class Initilization";

    }


}
