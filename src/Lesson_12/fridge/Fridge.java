package Lesson_12.fridge;

import Lesson_12.football.Team;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fridge {
    HashMap<String, Integer> products = new HashMap<>();
    HashMap<String, Integer> orders = new HashMap<>();
    Scanner scanner = new Scanner(System.in);


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
                    System.out.println(name + " v holodiljnike producta menjshe chem trebuetsja. Estj toljko " + products.get(name));
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

    //    Доделать задачу с холодильником.
//    В класс Fridge добавить метод addOrders(String name, Integer count)
//    в который можно будет передать продукты, которые вы хотите, чтобы холодильник вам заказал.
//    Сам метод должен добавлять желаемые продукты в новую мапу orders, перед этим проверив, нет ли продуктов уже в холодильнике.
//    Если такие продукты есть, необходимо вывести, что такой продукт есть в таком-то кол-ве, точно ли нужно добавлять его в orders.
//    После окончания метода необходимо усыпить программу на 10 секунд и потом перенести продукты в сам холодильник.
//
    public void addOrders() throws InterruptedException {
        System.out.println("Введите продукты которые хотите заказать и кол-во этих продуктов");
        boolean process = true;
        while (process) {
            process = false;
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            Integer count = sc.nextInt();
            if (products.containsKey(name)) {
                System.out.println(name + " Уже есть в холодильнике в кол-ве " + products.get(name));
                System.out.println("Если хотите добавить ещё ввидите число. Если нет то 0");
                count = sc.nextInt();
                if (count > 0) {
                    orders.put(name, count);
                }
            } else {
                orders.put(name, count);
            }
            System.out.println("Хотите ещё добавить продуктов в заказ? \n Да(1) \n Нет(0)");
            int answer = sc.nextInt();
            if (answer == 1) {
                System.out.println("Введите продукт и его желаемое кол-во");
                process = true;
            }
        }
        System.out.println("Список заказанных продуктов:");
        for (String s : orders.keySet()) {
            System.out.println(s + " : " + orders.get(s));
        }
        System.out.println("Холодильник засыпает");
        Thread.sleep(10000);
//        products.putAll(orders);
        ordersToProducts(orders);
        orders.clear();
        System.out.println("Заказанные продукты добавлены в холодильник");
    }

    private void ordersToProducts(HashMap<String, Integer> map) {
        for (String s : map.keySet()) {
            if (products.containsKey(s)) {
                products.put(s, map.get(s) + products.get(s));
            } else {
                products.put(s, map.get(s));
            }
        }

    }


}
