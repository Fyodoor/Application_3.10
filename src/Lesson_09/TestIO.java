package Lesson_09;

import java.io.*;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) throws IOException {
//        System.out.println();
//
//        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();
//
//        System.out.println("From scanner " + s);
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String line = reader.readLine();
//        System.out.println("From reader " + line);

        String inputFuleName = "C:\\Users\\Knyaz\\file.txt";
        File inputFileName1 = new File("file.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFuleName));
//        BufferedReader reader1 = new BufferedReader(new FileReader(inputFileName1.getAbsolutePath()));

        String line;

        while((line = reader.readLine()) != null) {
            System.out.println("Line from file : " + line + "\n");
        }
//        while((line = reader1.readLine()) != null) {
//            System.out.println("Line from file : " + line + "\n");
//        }

        String [] array = {"additional line 1", "additional line 2", "additional line 3"};
        File myFileToWrite = new File("C:\\Users\\Knyaz\\fileToWrite.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(myFileToWrite));

        for (String s : array) {
            writer.write(s + "\n");
        }
        for (int i = 0; i < array.length; i++) {
            writer.write(array[i]);
        }

    }
}
