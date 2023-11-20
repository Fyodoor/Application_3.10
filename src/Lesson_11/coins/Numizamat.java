package Lesson_11.coins;

import java.util.HashSet;
import java.util.TreeSet;

public class Numizamat {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 15.3, "Russia", 2008);
        Coin coin2 = new Coin(10, 29.5, "Belarus", 2010);
        Coin coin3 = new Coin(2, 19.3, "Spain", 2002);
        Coin coin4 = new Coin(2, 21.4, "Georgia", 2011);
        Coin coin5 = new Coin(10, 15.3, "Russia", 2008);

        HashSet<Coin> collection = new HashSet<>();
        collection.add(coin1);
        collection.add(coin2);
        collection.add(coin3);
        collection.add(coin4);
        collection.add(coin5);

        boolean compareTwoCoins = coin1.equals(coin5);

        System.out.println(compareTwoCoins);

        System.out.println(coin1);

        TreeSet<Coin> coinTreeSet = new TreeSet<>();
        coinTreeSet.add(coin1);
        coinTreeSet.add(coin2);
        coinTreeSet.add(coin3);
        coinTreeSet.add(coin4);
        coinTreeSet.add(coin5);

    }
}
