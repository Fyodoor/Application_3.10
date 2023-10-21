package Lesson_04;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello world";
        String email = scanner.nextLine();
        if (email.length() == 0){
            System.out.println("Errore_email pust");
        }
        if (!email.toLowerCase().endsWith(".ru")) {
            System.out.println("Errore. Email must to be ended ru dumen");
        }

        if (email.split("@").length != 2){
            System.out.println("Errore. Email must contains char '@'");
        }
        if (email.startsWith(".")){
            System.out.println("Error. Email must not to be started on char'.' ");
        }

        String finalEmail = email.toLowerCase();
        System.out.println(finalEmail);
    }
}
