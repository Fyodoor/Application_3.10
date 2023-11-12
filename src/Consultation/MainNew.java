package Consultation;

import java.util.Arrays;

public class MainNew {
    public static void main(String[] args) {
        String list = "Moloko, egg, bread";
        Product milk = new Product();
        milk.setName("Milk");
        milk.setCount(-3);
        System.out.println(milk.print());
        System.out.println(milk);

        Product eggs = new Product("Eggs", -10);
        System.out.println(eggs);

        Product[] arr = new Product[2];
        arr[0] = milk;
        arr[1] = eggs;
        System.out.println(Arrays.toString(arr));
    }
}
