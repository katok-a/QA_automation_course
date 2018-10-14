package HomeTasks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kotok_artem on 12.10.2018.
 */
public class Task_vacation_7 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        String[] symbols = text.toString().split("[a-zA-Z]+");
        int longestLength = 0;
        int longestIndex = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].length() > longestLength) {
                longestLength = symbols[i].length();
                longestIndex = i;
            }
        }
        System.out.println("Longest non-letter substring: " + symbols[longestIndex]);
    }
}
