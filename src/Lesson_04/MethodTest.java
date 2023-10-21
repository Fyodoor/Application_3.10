package Lesson_04;

public class MethodTest {
    public static void main(String[] args) {
        int salary = getMyFutureSalary();
        System.out.println(salary);

        int otve = get7x(9);
        System.out.println(otve);
    }

    public static int getMyFutureSalary() {
        return 300000;
    }

    public static int get7x(int num){
        return 7*num;
    }
}
