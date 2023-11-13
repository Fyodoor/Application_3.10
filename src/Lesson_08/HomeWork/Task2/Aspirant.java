package Lesson_08.HomeWork.Task2;

public class Aspirant extends Student{
    private String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        setScientificWork(scientificWork);
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 2500 : 2200;
    }
}
