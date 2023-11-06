package Consultion;

public class Main {
    public static void main(String[] args) {
        printq(8, 0);

        System.out.println(calc(4, 1));
    }
    public static void printq(int a, int cur) {
        if(a != cur) {
            for (int i = 0; i < cur; i++) {
                System.out.print("*");
            }
            System.out.println();
            printq(a, cur + 1);
        }


    }

    public static Integer calc(int finishNum, int start){
        if (start < finishNum) {
            return start + calc(finishNum, start + 1);
        }
        return finishNum;
    }


}
