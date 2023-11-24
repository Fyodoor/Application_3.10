package Lesson_11.homeWork;

import java.util.ArrayList;

public class Task_3 {

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).contains("р") && !strings.get(i).contains("л")){
                strings.remove(i);
            }
            if (!strings.get(i).contains("р") && strings.get(i).contains("л")) {
                strings.set(i, strings.get(i) + strings.get(i));
            }
        }
        return strings;
    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
