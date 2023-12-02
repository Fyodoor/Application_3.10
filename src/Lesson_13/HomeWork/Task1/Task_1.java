package Lesson_13.HomeWork.Task1;

import java.util.HashMap;

public class Task_1 {
//    1
//    1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//    2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//    3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//    4. Вывести содержимое Map на экран.



    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Звезда", "Рита");
        map1.put("Криклива", "Ольга");
        map1.put("Плюшкин", "Олег");
        map1.put("Иванов", "Иван");
        map1.put("Владаволов", "Иван");
        map1.put("Киселёв", "Григорий");
        map1.put("Иванов", "Захар");
        map1.put("Петрова", "Агата");
        map1.put("Романова", "Ольга");
        map1.put("Спилберг", "Стивен");

        System.out.println(map1);



    }
}
