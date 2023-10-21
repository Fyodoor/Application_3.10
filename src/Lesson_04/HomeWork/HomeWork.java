package Lesson_04.HomeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1
//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//        Пример: m=2, n=4
//        8888
//        8888
        System.out.println("Task 1");
        System.out.println("Введите два числа");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

//        2
//        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
//
//        Пример вывода на экран:
//        8
//        88
//        888
//        8888
//        88888
//        888888
//        8888888
//        88888888
//        888888888
//        8888888888

        System.out.println("Task 2");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

//        3
//        Ввести с клавиатуры три числа, вывести на экран среднее из них.
//        Т.е. не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.

        System.out.println("Task 3");
        System.out.println("Введите 3 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > c && c > b) || (b > c && c > a)) {
            System.out.println(c);
        } else if ((c > a && a > b) || (b > a && a > c)) {
            System.out.println(a);
        } else if ((a > b && b > c) || (c > b && b > a)) {
            System.out.println(b);
        } else if (a == b && c == b) {
            System.out.println(c);
        } else {
            System.out.println("В условие задачи ничего не сказано про случай когда только два числа равны.");
        }

//        int [] arrayTree = new int[3];
//        for (int i = 0; i < arrayTree.length; i++) {
//            arrayTree[i] = scanner.nextInt();
//        }
//        int buf = 0;
//        for (int i = 0; i < arrayTree.length; i++) {
//            for (int j = 0; j < arrayTree.length; j++) {
//                if (arrayTree[j] > arrayTree[j+1]) {
//                    buf = arrayTree[j];
//                    arrayTree[j+1] = buf;
//                }
//            }
//        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

//        4
//        Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//        -1 должно учитываться в сумме.
//
//        Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//
//        while (true) {
//            int number = считываем число;
//            if (проверяем, что number -1)
//            break;
//        }

        System.out.println("Task 4");
        System.out.println("Вводите числа. Как только введете '-1' , цикл остановится.");
        int counter = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1 ) {
                counter += number;
                break;
            }
            counter += number;
        }
        System.out.println(counter);


        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

//        5
//        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
//
//        Пример вывода на экран:
//        1 2 3 4 5 6 7 8 9 10
//        2 4 6 8 10 12 14 16 18 20
//        3 6 9 12 15 18 21 24 27 30
//        4 8 12 16 20 24 28 32 36 40
//        5 10 15 20 25 30 35 40 45 50
//        6 12 18 24 30 36 42 48 54 60
//        7 14 21 28 35 42 49 56 63 70
//        8 16 24 32 40 48 56 64 72 80
//        9 18 27 36 45 54 63 72 81 90
//        10 20 30 40 50 60 70 80 90 100

        System.out.println("Task 5");
        int x = 1;
        while(x <= 10) {
            int y = 1;
            while (y <= 10) {
                System.out.print(x * y + " ");
                y++;
            }
            x++;
            System.out.println();
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

//        6
//        Ввести с клавиатуры строку name.
//        Ввести с клавиатуры дату рождения (три числа): y, m, d.
//        Вывести на экран текст:
//        "Меня зовут name.
//        Я родился d.m.y"
//
//        Пример вывода:
//        Меня зовут Вася.
//        Я родился 15.2.1988

        System.out.println("Task 6");

        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите год рождения");
        int years = scanner.nextInt();
        System.out.println("Введите месяц рождение");
        int month = scanner.nextInt();
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();

        System.out.println("Меня зовут " + name + ".\nЯ родился " + day + "." + month + "." + years);
    }
}
