package Lesson_04;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int ageOfViktor = 32;
        int ageOfAirat = 25;
        int ageOfTagir = 22;
        int ageOfOleg = 49;

        int[] array1 = {11, 22, 33, 44, 55};

        System.out.println();

        int[] ages = {ageOfViktor, ageOfAirat, ageOfTagir, ageOfOleg};

        System.out.println();

//        int[] array2 = new int[5];
//
//        array2[0] = 111;
//        array2[1] = 222;
//        array2[2] = 333;
//        array2[3] = 444;
//        array2[4] = 555;
//
//        System.out.println(array2[3]);
//
//        for (int s : array2) {
//            System.out.print(s + " ");
//        }

        System.out.println();

//        int [] array4 = new int [10];
//        int counter = 0;
//        for (int i = 0; i < 51; i++) {
//            if(i % 5 == 0 && i != 0){
//                array4[counter] = i;
//                counter++;
//            }
//        }
//        for (int i: array4) {
//            System.out.print(i + " ");
//        }

//        int [] array5 = new int[10];

//        for (int i = 0; i < array5.length; i++) {
//            array5[i] = i + 90;
//        }
//        for (int s : array5){
//            System.out.print(s + " ");
//        }
//
//        System.out.println();
//
//        int [] array6 = new int[10];
//        int counter = 0;
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                array6[counter] = i;
//                counter++;
//            }
//        }
//        for (int i : array6) {
//            System.out.print(i + " ");
//        }


        Scanner scanner = new Scanner(System.in);
//        int [] array7 = new int[5];
//        for (int i = 0; i < array7.length; i++) {
//            array7[i] = scanner.nextInt();
//        }
//        for(int i : array7) {
//            System.out.print(i + " ");
//        }
        int [] lenina = new int[10];
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < lenina.length; i++) {
            lenina[i] = scanner.nextInt();
        }
        for (int i = 0; i < lenina.length; i++) {
            if(i % 2 == 0) {
                chet += lenina[i];
            } else {
                nechet += lenina[i];
            }
        }

        if (nechet > chet) {
            System.out.println("nechet boljshe");
        } else if (chet > nechet) {
            System.out.println("chet boljshe");
        } else {
            System.out.println("odinakovo");
        }
    }
}
