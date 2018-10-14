package HomeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_vacation_9 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        List<String> words = Arrays.asList(text.toString().split("\\s+"));
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m;
        for (int i = 0; i < words.size(); i++) {
            m = p.matcher(words.get(i));
            if (m.matches()) {
                System.out.print(words.get(i).substring(0,1).toUpperCase()+words.get(i).substring(1)+" ");
            }
            else System.out.print(words.get(i)+" ");
        }
    }
}
