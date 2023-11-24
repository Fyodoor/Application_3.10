package Lesson_11.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_1 {

    public static void addArray(List<String> array, int num) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            array.add(scanner.nextLine());
        }
    }


    public static void main(String[] args) {

//    1
//    Введи с клавиатуры 5 слов в HashSet. Удали 3 - ий элемент списка,
//    и выведи оставшиеся элементы в обратном порядке.
        // Дополнение - сделать через аррайлист


        List<String> array1 = new ArrayList<>();
        addArray(array1, 5);
        array1.remove(2);
        for (int i = array1.size() - 1; i >= 0 ; i--) {
            System.out.println(array1.get(i));
        }


    }
}
