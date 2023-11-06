package Lesson_09.exceptions;

public class Home {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");

        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyExceptions e) {
            e.printStackTrace();
            System.out.println("Proverjaem cht netak s psom: " +
                    "Osheinik" + dog.isCollarPutOn() + " " +
                    "Povodok" + dog.isLeashPutOn() + " " +
                    "Namordnok" + dog.isMuzzlePutOn()
                    );
        }
    }
}
