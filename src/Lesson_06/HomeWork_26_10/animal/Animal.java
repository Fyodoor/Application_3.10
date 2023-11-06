package Lesson_06.HomeWork_26_10.animal;

public class Animal {
    private String food;
    private String location;

    public void makeNoise(){
        System.out.println("The animal is making some noise");
    }
    public void eat(){
        System.out.println("I'm eating...");
    }
    public void sleep(){
        System.out.println("The animal is sleeping");
    }

    public String getAnimal(Animal animal){
        if (animal instanceof Cat) {
            return "Cat";
        } else if (animal instanceof  Dog) {
            return "Dog";
        } else {
            return "Horse";
        }
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
