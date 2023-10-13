package Lesson_04;

public class Application {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0 && i != 0) {
//                System.out.println(i);
//            }
//        }

        int count1 = 0;
        for (int i = 10; i <= 20; i++) {
            count1 += i;
        }
        System.out.println(count1);

//        for (int i = 10; i <= 40; i++) {
//            if(i < 15 || i > 20){
//                System.out.println(i);
//            }
//        }

        int count = 10;
        while (count > 0){
            System.out.println(count + "...");
            count--;
        }

    }
}
