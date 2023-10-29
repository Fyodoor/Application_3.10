package Lesson_06.dreamtram;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 3 сущности - фронт, бекенд, Проджектменеджер
        // фронт - работать, писать скрипты, получать зп
        // бекенд - писать код, записывать данные в БД, получать зп
        //Проджектменеджер получать зп, составлять ТЗ

        Fronteder front = new Fronteder("Vasiliy","frontender");
        Backend back = new Backend("Dmitriy", "java-developer");
        ProjectManager projectManager = new ProjectManager("Viktor", "analytic");

        front.writingScripts();
        front.getSalary(1000);

        back.writingCode();
        back.work("Spring aplication");
        back.getSalary(1500);

        projectManager.work("Analysing data");
        projectManager.getSalary(1300);
    }
}
