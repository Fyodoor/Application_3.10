package Lesson_06.interfaces;

public class Children implements HumanInterface{

    @Override
    public int swim() {
        return 500;
    }

    @Override
    public int run() {
        return 1000;
    }

    @Override
    public int sleepHours() {
        return 6;
    }
}
