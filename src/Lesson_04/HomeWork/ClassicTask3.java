package Lesson_04.HomeWork;

import java.util.Scanner;

public class ClassicTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3");

        int num3 = scanner.nextInt();
        switch (num3) {
            default:
                System.out.println("Такого месяце не существует");
                break;
            case 1 :
            case 2 :
            case 12 :
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}
