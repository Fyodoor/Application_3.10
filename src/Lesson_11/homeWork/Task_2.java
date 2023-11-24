package Lesson_11.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_2 {
    //        2
//        1. Создай список из слов HashSet "мама", "мыла", "раму".
//        2. После каждого слова вставь в список строку, содержащую слово "именно".
//        3. Вывести результат на экран, каждый элемент списка с новой строки.
    // Дополнение - сделать через аррайлист

    public static void main(String[] args) {
        List<String> array2 = new ArrayList<>();
        array2.add("мама");
        array2.add("мыла");
        array2.add("раму");
        System.out.println(array2);
        String words = "именно";
        for (int i = 0; i < array2.size(); i++) {
            array2.add(++i, words);
        }
        for (String s : array2) {
            System.out.println(s);
        }
    }
}
