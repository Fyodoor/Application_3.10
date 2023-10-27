package Lesson_04;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr = {24,15,21,7,11};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int remember = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    remember = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = remember;
                }
            }
        }

        System.out.println();
    }
}
