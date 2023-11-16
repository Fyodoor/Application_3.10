package Lesson_10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Integer b = 10;
        Byte d = 15;
        Short e = 100;
//        Long l = 1L;



        ArrayList<Integer> list = new ArrayList<>();

        //1 Добавление элемента в коллекцию

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //2 Добавление элемента в коллекцию с указанием индекса на котором элемент будет лежать

        list.add(3,10);

        //3 - замена элемента

        list.set(3, 20);

        //4 удаление объекта из коллекции
        Integer i = 2;

        list.remove(2);

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("AAA");
        stringArrayList.add("BBB");
        stringArrayList.add("CCC");
        stringArrayList.add("DDD");

        stringArrayList.remove("BBB");



        //5 узнать длину коллекции
        System.out.println("size of list is - " + list.size());

        //6 печать листа и проход по листу
//        for (int i = 0; i < stringArrayList.size(); i++) {
//            System.out.println(i + " element is " + stringArrayList.get(i));
//        }
        for (String s: stringArrayList) {
            System.out.println(s);
        }

        //7 как узнать индекс определенного элемента и его наличие в коллекции

        System.out.println("Element CCC has index " + stringArrayList.indexOf("CCC") + " in our collection");

        // 8 узнать пустая коллекция или нет
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("AAA");
        list1.add("BBB");
        list1.add("CCC");
        list1.add("DDD");

        ArrayList<String> list2 = new ArrayList<>();

        System.out.println("Collection list1 is emmpty? " + list1.isEmpty());
        System.out.println("Collection list2 is emmpty? " + list2.isEmpty());

        // 9 удалять все элементы из коллекции

        list1.clear();


        System.out.println(list);

        System.out.println(list);
        System.out.println(stringArrayList);

        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        ArrayList<Integer> list5 = new ArrayList<>();

    }
}
