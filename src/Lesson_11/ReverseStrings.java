package Lesson_11;

import java.awt.datatransfer.StringSelection;
import java.util.Comparator;

public class ReverseStrings implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
