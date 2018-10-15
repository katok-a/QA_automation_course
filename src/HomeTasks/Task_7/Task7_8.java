package HomeTasks;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kotok_artem on 09.10.2018.
 */
public class Task7_8 {
    public static void main(String[] args) {


        String[] words = Task7_4.words();
        ArrayList<String> numbers = new ArrayList<>();
        Pattern p = Pattern.compile("\\d*");
        Matcher m;
        for (String word : words) {
            m = p.matcher(word);
            if (m.matches()) {
                numbers.add(word);
            }
        }
        System.out.println("numbres" + numbers);
        ArrayList<String> palindromes = new ArrayList<>();

        for (String number : numbers) {
            if (number.length() == 1) {
                palindromes.add(number);
                continue;
            }
            int rounds = (number.length() / 2);
            int count = 0;
            for (int i = 0; i <= rounds; i++) {

                if (number.charAt(i) != number.charAt((number.length() - 1 - i))) {
                    break;
                } else {
                    count++;
                    if (count == rounds) {
                        palindromes.add(number);
                    }
                }
            }

        }
        if (palindromes.size() > 1) {
            System.out.println("Second palindrome:" + palindromes.get(1));
        } else {
            System.out.println("Palindrome:" + palindromes.get(0));
        }
    }


}

