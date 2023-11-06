package Lesson_06.HomeWork;

import java.util.Scanner;

public class FourAndFiveTask {

    //home work 23.10

//     5
//     Написать программу, которая:
//     1. считывает с консоли число N, которое должно быть больше 0
//     2. потом считывает N чисел с консоли
//     3. выводит на экран максимальное из введенных N чисел.

//    4
//    Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
//    Вывести на экран полученную сумму.

    static void taskFour(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа до тех пор пока не введёте слово 'сумма'");
        Integer summa = 0;
        while (true) {
            String n = scanner.nextLine();
            Integer n1 = null;
            if (n.equals("сумма")) {
                break;
            }
            n1 = Integer.parseInt(n);

            summa += n1;
        }
        System.out.println(summa);
    }

//     5
//     Написать программу, которая:
//     1. считывает с консоли число N, которое должно быть больше 0
//     2. потом считывает N чисел с консоли
//     3. выводит на экран максимальное из введенных N чисел.
    static void taskFive(){
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        int[] massiv = new int[numberN];
        int max = massiv[0];
        for (int i = 0; i < numberN; i++) {
            massiv[i] = scanner.nextInt();
            if (massiv[i] > max) {
                max = massiv[i];
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        taskFour();
        taskFive();

    }
}
