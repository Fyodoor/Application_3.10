package Lesson_12;

import Lesson_12.football.Team;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Zenith", 20);
        hashMap.put("Spartak", 18);
        hashMap.put("Rubin", 15);
        hashMap.put("Rubin",333);
        hashMap.put("Lokomotiv", 10);
        hashMap.put(null, 111);

        // 2 proverka nalichia kljucha

        System.out.println(hashMap.containsKey("Zenith"));
        System.out.println(hashMap.containsKey("CSKA"));

        // 3 prohod po kollekcii

        HashMap<String, Team> table = new HashMap<>();
        table.put("Zenith", new Team(30, 21, 20));
        table.put("Spartak", new Team(25, 31, 20));
        table.put("Rubin", new Team(35, 27, 20));

        for (Map.Entry<String, Team> e : table.entrySet()) {
            System.out.println(e.getKey() + " \n Games: " + e.getValue().getGames()
            + " \n Score : " + e.getValue().getScore()
            + " \n Goals : " + e.getValue().getGoals());

        }

        // 4 pechatj kljuchei

        for (String s : table.keySet()) {
            System.out.println(s + ";");
        }

        // 5 vernutj znachenie po kljuchu

        for (String s: table.keySet()) {
            System.out.println("Goals of " + s + " = " + table.get(s).getGoals() + ";");
        }

        System.out.println();

        System.out.println();

        // 6 udalenie

        table.remove("Zenith");
    }
}
