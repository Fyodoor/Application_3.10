package Lesson_12.fridge;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.addProducts("Milk", 1);
        fridge.addProducts("Milk", 2);
        fridge.addProducts("Apple", 3);
        fridge.addProducts("Potatoes", 5);
        fridge.addProducts("Juice", 2);
        fridge.addProducts("Onion", 2);
        fridge.addProducts("Carrot", 1);
        fridge.addProducts("Meat", 5);
        fridge.addProducts("Eggs", 10);

        fridge.all();
        fridge.take("Meat", 6);
        fridge.all1();
    }
}
