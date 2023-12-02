package Lesson_13.HomeWork.Task2;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
//        2
//        Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//        Используй коллекции.
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("January", 1);
        map2.put("February", 2);
        map2.put("March", 3);
        map2.put("April", 4);
        map2.put("May", 5);
        map2.put("June", 6);
        map2.put("July", 7);
        map2.put("August", 8);
        map2.put("September", 9);
        map2.put("October", 10);
        map2.put("November", 11);
        map2.put("December", 12);

        String month = scanner.nextLine();
//        for (String x : map2.keySet()) {
//            x.toUpperCase();
//            month.toUpperCase();
//            if (map2.containsKey(x.equalsIgnoreCase(month))) {
//                System.out.println(x + " is the " + map2.get(x));
//                break;
//            } else if (!map2.containsKey(month)) {
//                System.out.println("Month is wrong");
//                break;
//            }
//        }

        if (map2.containsKey(month)) {
            System.out.println(month + " is the " + map2.get(month));
        } else {
            System.out.println("Month is wrong");
        }





    }
}
