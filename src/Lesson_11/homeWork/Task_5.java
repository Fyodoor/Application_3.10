package Lesson_11.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_5 {
    //    5
//    1. Введи с клавиатуры 10 слов в список строк.
//    2. Определить, является ли список упорядоченным по возрастанию длины строки.
//    3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addArray(list, 10);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i - 1).length()) {
                System.out.println(i + " - индекс первого элемента, нарушающего такую упорядоченность");
                break;
            } else if (i == list.size() - 1) {
                System.out.println("Список упорядочен по длине строки");
            }
        }
    }


    public static void addArray(List<String> array, int num) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            array.add(scanner.nextLine());
        }
    }
}
