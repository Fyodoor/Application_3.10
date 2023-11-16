package Lesson_10;

import java.util.ArrayList;

public class Tasks {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }
        for (Integer i: arrayList) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 10; i <= 20; i++) {
            arrayList2.add(i);
        }
        for(Integer i: arrayList2) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("A");
        arrayList3.add("B");
        arrayList3.add("C");
        arrayList3.add("D");
        arrayList3.add("F");
        arrayList3.add("G");
        arrayList3.add("H");

        // C and G
        arrayList3.remove("C");
        arrayList3.remove("G");





    }
}
