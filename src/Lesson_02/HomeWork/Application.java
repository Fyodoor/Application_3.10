package Lesson_02.HomeWork;

public class Application {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача первая");

        int result = -a + b - c + d;

        System.out.println(result);
        System.out.println();
        System.out.println("*************************************************");
        System.out.println();

        System.out.println("Задача вторая");

        double tovar1 = 1000;
        double tovar2 = 500;
        double dvaTovara = tovar1 + tovar2;
        double tovariSoSkidkoi = dvaTovara - dvaTovara*0.1;
        double poluchennajaSkidka = dvaTovara - tovariSoSkidkoi;
        System.out.println("Cумма покупки со скидкой: " + tovariSoSkidkoi);
        System.out.println("Сумма скидки: " + poluchennajaSkidka);

        System.out.println();
        System.out.println("*************************************************");
        System.out.println();

        System.out.println("Задача третья");
        // a) овар А стоит 200 руб и на него скидка 15%, а товар Б стоит 30 руб.
        // Клиент взял 10 A и 2 Б. Выведите итоговую цену:
        double tA1 = 200;
        double tB1 = 30;
        double tA1_v2 = tA1 - (tA1 * 0.15); // товар А после скидки
        double tA1_v3 = tA1_v2 * 10; // кол-во товаров А
        double tB1_v2 = tB1 * 2; // кол-во товаров B
        double result1 = tA1_v3 + tB1_v2; // итоговая сумма всех товаров в варианет а)
        System.out.println();
        System.out.println("a) Итоговая цена: " + result1);

        // б) товар А стоит 500 руб и на него скидка 50%, а товар Б стоит 50 руб.
        // Клиент взял 7 A и 1 Б. Выведите итоговую цену:
        double tA2 = 500;
        double tB2 = 50;
        double tA2_v2 = tA2 - (tA2 * 0.50); // товар А после скидки
        double tA2_v3 = tA2_v2 * 7; // кол-во товаров А
        double result2 = tA2_v3 + tB2; // итоговая сумма всех товаров в варианет б)
        System.out.println("б) Итоговая цена: " + result2);

        // в) товар А стоит 300 руб и на него скидка 10%, а товар Б стоит 20 руб.
        // Клиент взял 2 A и 3 Б. Выведите итоговую цену.
        double tA3 = 300;
        double tB3 = 20;
        double tA3_v2 = tA3 - (tA3 * 0.1); // товар А после скидки
        double tA3_v3 = tA3_v2 * 2; // кол-во товаров А
        double tB3_v2 = tB3 * 3; // кол-во товаров B
        double result3 = tA3_v3 + tB3_v2; // итоговая сумма всех товаров в варианет в)
        System.out.println("в) Итоговая цена: " + result3);
    }
}
