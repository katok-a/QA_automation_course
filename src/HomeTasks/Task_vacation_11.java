package HomeTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_vacation_11 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        Pattern p = Pattern.compile("\\d");
        Matcher m;
        int sum =0;
        for(int i=0;i<text.length();i++){
            m=p.matcher(text.substring(i,i+1));
            if(m.matches()){
                sum+=Integer.parseInt(text.substring(i,i+1));
            }

        }
        System.out.println("Sum of all digits: " +sum);
    }
}
