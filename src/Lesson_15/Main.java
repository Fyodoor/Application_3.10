package Lesson_15;

import Lesson_11.coins.Coin;

import javax.management.Attribute;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // название класса
        // название пакета
        // поля
        // методы

        // name
        // packageName
        // listOfAttributes
        // listOfMethods

        Coin coin1 = new Coin();

        java.lang.Class<Coin> coin = Coin.class;

//        Class c = coin1.getClass();
//        System.out.println(coin.getName());
//
//        Class<?> c2 = Class.forName("Lesson_11.coins.Coin");
//        System.out.println(c2.getName());

//        Method[] methods = coin.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            if (method.getDefaultValue() != null) {
//                System.out.println(method.getDefaultValue());
//            }
//        }

        Field[] declaredFields = coin.getDeclaredFields();

//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//            System.out.println(declaredField.getType());
//            declaredField.set(String.class, "newValue");
//        }

        System.out.println();



    }
}

class Class {
    String name;
    String packageName;
    List<Attribute> attributes;
    List<Method> methods;
}