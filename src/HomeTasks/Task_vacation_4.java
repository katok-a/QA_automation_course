package HomeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kotok_artem on 11.10.2018.
 */
public class Task_vacation_4 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        Pattern p = Pattern.compile("[a-zA-Z]| ");
        Matcher m;
        for (int i = 0; i < text.length(); i++) {
            m = p.matcher(text.substring(i, i + 1));
            if (!m.matches()) {
                text.replace(i, i + 1, " ");
            }
        }
        System.out.println(text); // In fact, the task is complete here - only letters and SPACEs remain.
        String[] lessSpace = text.toString().split("\\s+");
        for(int i =0;i<lessSpace.length;i++){
            System.out.print(lessSpace[i]+" "); // Now only one space per word is printed.
        }
    }
}
