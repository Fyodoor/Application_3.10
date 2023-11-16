package Consultation;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.addAll(Arrays.asList(4,5,6));
        System.out.println(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.addAll(Arrays.asList(10,11,12));
        System.out.println(linkedList);

        MyLinkedList myLinkedList = new MyLinkedList("First value");
        myLinkedList.add("second value");
        System.out.println(myLinkedList);

        Collections.rotate(linkedList, 1);
        System.out.println(linkedList);
        System.out.println(Collections.frequency(linkedList, 10));
    }
}
