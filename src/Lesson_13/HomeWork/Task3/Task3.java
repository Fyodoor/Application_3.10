package Lesson_13.HomeWork.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /* 3
    Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
    Новая задача: Программа должна работать не с номерами домов, а с городами:

    Пример ввода:
    Москва
    Ивановы
    Киев
    Петровы
    Лондон
    Абрамовичи
    Лондон

    Пример вывода:
    Абрамовичи
    */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> map = new HashMap<>();
        while (true) {
            int numberHouse = Integer.parseInt(reader.readLine());
            if (numberHouse <= 0 ) {
                break;
            }
            String family = reader.readLine();

            map.put(numberHouse, family);
        }

        int numberHouse = Integer.parseInt(reader.readLine());

        if (map.containsKey(numberHouse)) {
            String familyName = map.get(numberHouse);
            System.out.println(familyName);
        }
    }
}
