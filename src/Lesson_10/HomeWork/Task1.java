package Lesson_10.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //    1
//    1. Создай список строк.
//    2. Добавь в него 5 различных строк.
//    3. Выведи его размер на экран.
//    4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");

        List<String> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList1.add(scanner.nextLine());
        }
        System.out.println("Size arrayList1 " + arrayList1.size());
        for (String s : arrayList1) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

//        2
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую длинную строку в списке.
//        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

        System.out.println("Task 2");

        List<String> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList2.add(scanner.nextLine());
        }
        int arrayList2MaxLength = arrayList2.get(0).length();
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2MaxLength < arrayList2.get(i).length()) {
                arrayList2MaxLength = arrayList2.get(i).length();
            }
        }
        for (String s : arrayList2) {
            if (s.length() == arrayList2MaxLength) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

//        3
//      1. Создай список строк.
//      2. Считай с клавиатуры 5 строк и добавь в список.
//      3. Используя цикл, найди самую короткую строку в списке.
//      4. Выведи найденную строку на экран.
//      5. Если таких строк несколько, выведи каждую с новой строки.

        System.out.println("Task 3");

        List<String> arrayList3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList3.add(scanner.nextLine());
        }
        int arrayList3MinLength = arrayList3.get(0).length();
        for (int i = 0; i < arrayList3.size(); i++) {
            if (arrayList3MinLength > arrayList3.get(i).length()) {
                arrayList3MinLength = arrayList3.get(i).length();
            }
        }
        for (String s : arrayList3) {
            if (s.length() == arrayList3MinLength) {
                System.out.println(s);
            }
        }


        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();


//          4
//        1. Создай список строк в методе main.
//        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
        System.out.println("Task 4");

        List<String> arrayList4 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList4.add(0, scanner.nextLine());
        }
        for (String s : arrayList4) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

//        5
//        1. Создай список строк.
//        2. Добавь в него 5 строк с клавиатуры.
//        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
        System.out.println("Task 5");

        List<String> arrayList5 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList5.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String str = arrayList5.get(arrayList5.size() - 1);
            arrayList5.remove(arrayList5.size() - 1);
            arrayList5.add(0, str);
        }
        for (String s : arrayList5) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

//        6
//        1. Создай список строк.
//        2. Добавь в него 10 строчек с клавиатуры.
//        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//        Если таких строк несколько, то должны быть учтены самые первые из них.
//        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
        System.out.println("Task 6");

        List<String> arrayList6 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList6.add(scanner.nextLine());
        }
        int max = arrayList6.get(0).length();
        int min = arrayList6.get(0).length();
        for (int i = 0; i < arrayList6.size(); i++) {
            if (arrayList6.get(i).length() > max) {
                max = arrayList6.get(i).length();
            }
            if (arrayList6.get(i).length() < min) {
                min = arrayList6.get(i).length();
            }
        }
        for (String s : arrayList6) {
            if (s.length() == max) {
                System.out.println(s);
                break;
            } else if (s.length() == min) {
                System.out.println(s);
                break;
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

//        7
//        1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//        Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//        Порядок объявления списков очень важен.
//        1.1 Создай метод printList
//        2. Метод printList должен выводить на экран все элементы списка с новой строки.
//        3. Используя метод printList выведи эти три списка на экран.
//        Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

        System.out.println("Task 7");

        List<Integer> arrayList7 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList7.add(scanner.nextInt());
        }
        List<Integer> divisibleByThree = new ArrayList<>(); // переведено с помощью гуглтранслейт
        List<Integer> divisibleByTwo = new ArrayList<>(); // переведено с помощью гуглтранслейт
        List<Integer> andAllTheRest = new ArrayList<>(); // переведено с помощью гуглтранслейт

        for (Integer i : arrayList7) {
            if (i % 3 == 0) {
                divisibleByThree.add(i);
            }
            if (i % 2 == 0) {
                divisibleByTwo.add(i);
            }
            if (i % 3 != 0 && i % 2 != 0) {
                andAllTheRest.add(i);
            }
        }

        System.out.println("Список x%3==0");
        prinlist(divisibleByThree);
        System.out.println("Список x%2==0");
        prinlist(divisibleByTwo);
        System.out.println("Список 'и все остальные'");
        prinlist(andAllTheRest);


    }

    public static void prinlist(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }


}





