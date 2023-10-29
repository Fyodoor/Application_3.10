package Lesson_06.interfaces;

public class OldMan implements HumanInterface{
    @Override
    public int swim() {
        return 2000;
    }

    @Override
    public int run() {
        return 2000;
    }

    @Override
    public int sleepHours() {
        return 8;
    }
}
