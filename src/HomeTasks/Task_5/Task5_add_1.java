package HomeTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

/**
 * Created by kotok_artem on 02.10.2018.
 */
public class Task5_add_1 {
    public static boolean regExpTester1(String toTest) {

        String pattern = ".*[a-zA-Z]{4,}.*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(toTest);
        return !m.matches();


    }

    public static boolean regExpTester2(String toTest) {
        String pattern = ".{4}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(toTest);
        return m.matches();
    }

    public static void main(String[] args) {


        String regEx1_Example1 = "125abc$";
        String regEx1_Example2 = "125abcddd$";
        System.out.println("RegEX 1:");
        System.out.println(regEx1_Example1 + " " + regExpTester1(regEx1_Example1));
        System.out.println(regEx1_Example2 + " " + regExpTester1(regEx1_Example2));

        String regEx2_Example1 = "qw12";
        String regEx2_Example2 = "134";
        String regEx2_Example3 = "qw1;%:2";
        System.out.println("RegEX 2:");
        System.out.println(regEx2_Example1 + " " + regExpTester2(regEx2_Example1));
        System.out.println(regEx2_Example2 + " " + regExpTester2(regEx2_Example2));
        System.out.println(regEx2_Example3 + " " + regExpTester2(regEx2_Example3));

    }


}
