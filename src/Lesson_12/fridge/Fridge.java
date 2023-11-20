package Lesson_12.fridge;

import Lesson_12.football.Team;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fridge {
    HashMap<String, Integer> products = new HashMap<>();


    public void addProducts(String name, Integer count) {
        if (products.containsKey(name)) {
            Integer alreadyInFridge = products.get(name);
            products.put(name, alreadyInFridge + count);
        } else {
            products.put(name, count);
        }
    }

    public void take(String name, Integer count) {
        if (!products.containsKey(name)) {
            System.out.println(name + " v holodiljnike net");
            return;
        } else if (products.get(name) < count) {
            System.out.println(name + " v holodiljnike producta menjshe chem trebuetsja. Estj toljko" + products.get(name));
            while (true) {
                System.out.println("Skoljko hotite zabratj?");
                Scanner scanner = new Scanner(System.in);
                Integer takeCount = scanner.nextInt();
                if (takeCount > products.get(name)) {
                    System.out.println(name + " v holodiljnike producta menjshe chem trebuetsja. Estj toljko" + products.get(name));
                } else if (takeCount <= products.get(name)) {
                    System.out.println("Berete dlja mami " + name + " v kollichestve: " + takeCount);
                    products.put(name, products.get(name) - takeCount);
                    if (products.get(name) == 0) {
                        products.remove(name);
                    }
                    return;
                }

            }
        }
    }

    public void all() {
        for (Map.Entry<String, Integer> e : products.entrySet()) {
            System.out.println(e);
        }
    }
    public void all1() {
        for (String s : products.keySet()) {
            System.out.println(s + " : " + products.get(s));
        }
    }
}
