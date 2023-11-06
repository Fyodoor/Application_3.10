package Lesson_09.exceptions;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar(){
        System.out.println("Ошейник одет");
        this.isCollarPutOn = true;
    }
    public void putLeash(){
        System.out.println("Поводок одет");
        this.isLeashPutOn = true;
    }
    public void putMuzzle(){
        System.out.println("Намордник одет");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyExceptions {
        System.out.println("Idem na progulku");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Da mi gotovi");
        } else {
            throw new DogIsNotReadyExceptions("Собака не готова");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }

    public void setCollarPutOn(boolean collarPutOn) {
        isCollarPutOn = collarPutOn;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public void setLeashPutOn(boolean leashPutOn) {
        isLeashPutOn = leashPutOn;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void setMuzzlePutOn(boolean muzzlePutOn) {
        isMuzzlePutOn = muzzlePutOn;
    }
}
