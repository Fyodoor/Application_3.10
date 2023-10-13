package Lesson_03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /**
         Операторы сравнения

         ==  Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным  (A == B) – не верны

         !=  Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным  (A != B) – значение истинна

         >  Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным  (A > B) – не верны

         <  Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным  (A < B) – значение истинна

         >=  Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным  (A >= B) – значение не верны

         <=  Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным  (A <= B) – значение истинна

         &&  Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||  Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !  Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         */

        int a = 5;
        int b = 10;

        boolean bn = a > b;
        boolean bn1 = a != b;
        boolean bn2 = a == b;
        System.out.println(bn);
        System.out.println(bn1);
        System.out.println(bn2);

        System.out.println();

        boolean bl = a > b && a < b;
        boolean bl1 = a > b || a < b;
        System.out.println(bl);
        System.out.println(bl1);
        System.out.println(!bl);

        // if, else

//        int age = 15;
//        if (age > 14) {
//            System.out.println("Norm");
//        }
//        else {
//            System.out.println("Slishkom jun");
//        }


        System.out.println();

//        int height = 175;
//
//        if(height > 125 && height < 220) {
//            System.out.println("Mozhno na am. gorki");
//        } else {
//            System.out.println("Net, po rostu ne vishel dlja gorki");
//        }
//
//        int day = 1;
//        if (day == 1){
//            System.out.println("Segodnja ponedeljnik");
//        } else if (day == 2) {
//            System.out.println("Segodnja vtornik");
//        } else {
//            System.out.println("Takogo dnja net");
//        }

        int rate = 1;

        if (rate == 5) {
            System.out.println("Otlichno");
        } else if (rate == 4) {
            System.out.println("Horosho");
        } else if (rate == 3) {
            System.out.println("Udo");
        } else if (rate == 2) {
            System.out.println("ploho");
        } else if (rate == 1) {
            System.out.println("Uzhasno");
        } else {
            System.out.println("Takoi ocenki net");
        }


        int s = 75;

        if (s < 49 || s > 100) {
            System.out.println("Chislo ne popadaet v diapozon");
        } else {
            System.out.println("Chislo popadaet v diapozon");
        }


        //switch case

        /*
        * switch (day1) {
            case 1:
                System.out.println("Ponedeljnik");
                break;
            case 2:
                System.out.println("Vtornik");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetverg");
                break;
            case 5:
                System.out.println("Pjatnica");
            case 6:
                System.out.println("Subbota");
                break;
            case 7:
                System.out.println("Voskresenje");
                break;
            default:
                System.out.println("Net takogo dnja nedeli");
        }*/


//        int day1 = 3;
        Scanner scan = new Scanner(System.in);
//        int day1 = scan.nextInt();
//
//        switch (day1) {
//            case 1 -> System.out.println("Ponedeljnik");
//            case 2 -> System.out.println("Vtornik");
//            case 3 -> System.out.println("Sreda");
//            case 4 -> System.out.println("Chetverg");
//            case 5 -> System.out.println("Pjatnica");
//            case 6 -> System.out.println("Subbota");
//            case 7 -> System.out.println("Voskresenje");
//            default -> System.out.println("Net takogo dnja nedeli");
//        }

        int temp = scan.nextInt();
        switch (temp){
            case -15 -> System.out.println("Holodno");
            case 0 -> System.out.println("Normaljno");
            case 15 -> System.out.println("Teplo");
            default -> System.out.println("Neponjatna pogoda");
        }
    }
}
