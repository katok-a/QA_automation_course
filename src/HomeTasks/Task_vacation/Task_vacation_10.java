package HomeTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_vacation_10 {
    public static void main(String[] args) {


        StringBuilder text = Task_vacation_1.textBuilder();
        Pattern p =Pattern.compile("\\.|,|!|\\?|:|\\;");
        Matcher m = p.matcher(text);
        int count =0;
        while(m.find()){
            count++;
        }
        System.out.println("Number of punctuation: "+count);
    }
}
