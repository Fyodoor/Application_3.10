package Lesson_02;

public class Practice {
    public static void main(String[] args) {
        /**
         Арифметические операторы
         +  Складывает значения по обе стороны от оператора
         -  Вычитает правый операнд из левого операнда
         *  Умножает значения по обе стороны от оператора
         /  Оператор деления делит левый операнд на правый операнд
         %  Делит левый операнд на правый операнд и возвращает остаток
         ++  Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         --  Декремент - уменьшает значение операнда на 1  х-- постфиксная, --х префиксная
         * */

        /* int a = 10; // 10/3=3
        int b = 3;
        int c = a%b;
        int d = a%2;
        int e = 5;
        e++;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e); */

        // Задача 1. Дано а = 60, b = 45, c = 17. Найти периметр треугольнка.
        /*int a = 60;
        int b = 45;
        int c = 17;
        int perimetr = a + b + c;
        System.out.println(perimetr); */

        // Задача 2. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут.
        // за сколько быстрее голодный Вася съедает 1 банан
        /*
        int hungryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int oneBanansHungry = hungryTime / bananas;
        int oneBanansFull = fullTime / bananas;
        int difference = oneBanansFull - oneBanansHungry;
        System.out.println(difference);
        */

        // Задача 3. Дано: Коля получил много двоек и закопал свой дневник на 127 метров.
        // Потом вернулся и угробился ещё на 2 метра. На сколько в итоге закопал свой дневник Коля?
        /*byte b1 = 127;
        byte b2 = (byte) (b1 +2);
        System.out.println(b2);*/

        // Задача 4. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей в каждой кассе?

        /*double cash = 5;

        double cashMashine1 = cash / 2;
        double cashMashine2 = cash - cashMashine1;
        System.out.println(cashMashine1);
        System.out.println(cashMashine2);*/

        // Задача 5. Дано: Есть 10, 3 и метод научного тыка. Найти длину после запятой float и double

        /*double d = 10.0/3;
        float f = (float) (10.0/3);
        System.out.println(d);
        System.out.println(f);*/

        // Задача 6. Дано: 10 красных яблок и 5 зеленых. Верно ли утверждение что красных яблок больше чем зелёных?

        /*int redApple = 10;
        int greenApple = 5;
        // statement - утверждение (англ)
        boolean statement = redApple > greenApple;
        System.out.println("Верно ли утверждение что красных яблок больше чем зелёных? - " + statement);*/

    }
}
