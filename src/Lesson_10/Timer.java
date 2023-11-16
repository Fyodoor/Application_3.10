package Lesson_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Timer {

    public static void main(String[] args) throws InterruptedException {

        Integer counts = 500000;

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < counts; i++) {
            integerArrayList.add(i);
        }
        Date now = new Date();
        for (int i = 0; i < counts; i++) {
            integerArrayList.add(integerArrayList.size() / 2, i);
        }

//        Thread.sleep(3000);

        Date then = new Date();
        System.out.println(then.getTime() - now.getTime());

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < counts; i++) {
            linkedList.add(i);
        }
        Date now1 = new Date();
        for (int i = 0; i < counts; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }

//        Thread.sleep(3000);

        Date then1 = new Date();
        System.out.println(then1.getTime() - now1.getTime());
    }
}
