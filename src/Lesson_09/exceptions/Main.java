package Lesson_09.exceptions;

import java.io.*;

public class Main {
    public static void main(String[] args) {

//        int counter = 10;
//        while(counter > 0) {
//            System.out.println(counter + "...");
//            Thread.sleep(1000);
//            counter--;
//
//        }


        System.out.println("1. Exception - how it works");
//        System.out.println(10 / 0);
//
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(1);
        System.out.println("2. Exception / null - how it works");
        String s = null;
//        System.out.println(s.length());
        System.out.println("3. HandLing Exception - how it works");
        if (s != null) {
            System.out.println(s.length());
        }

        System.out.println("4. HandLing Exceptio by try/catch - how it works");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String line = null;
//        try {
//            line = reader.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("From reader " + line);
        String inputFuleName = "C:\\Users\\Knyaz\\file.txt";

//        BufferedReader reader = null;
//        String line = null;
//        try {
//            reader = new BufferedReader(new FileReader(inputFuleName));
//            line = null;
//            line = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Line from file : " + line + "\n");

//        while((line = reader.readLine()) != null) {
//            System.out.println("Line from file : " + line + "\n");
//        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(inputFuleName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ПРОИЗОШЛА ОШИБКА, ОТПРАВЬ СМС С ОШИБКОЙ");
        }


        System.out.println("Окончание программы");




    }
}
