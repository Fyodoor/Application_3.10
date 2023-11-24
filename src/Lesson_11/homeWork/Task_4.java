package Lesson_11.homeWork;

import java.util.*;

public class Task_4 {
    //    4
//     1. Введи с клавиатуры 10 слов в список строк.
//    2. Метод doubleValues должен удваивать слова по принципу:
//    "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addArray(list, 10);
        System.out.println(list);
        doubleValues(list);
        for (String s : list) {
            System.out.println(s);
        }

    }



    public static void addArray(List<String> array, int num) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            array.add(scanner.nextLine());
        }
    }

    public static List<String> doubleValues(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }
}
