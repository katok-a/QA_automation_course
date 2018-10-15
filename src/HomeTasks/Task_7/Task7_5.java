package HomeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kotok_artem on 08.10.2018.
 */
public class Task7_5 {

    public static void main(String[] args) {
        String[] words = Task7_4.words();
        ArrayList<String> engWords = new ArrayList<String>();
        Pattern p = Pattern.compile("[a-zA-Z]*");
        Matcher m;

        for (String word : words) {
            m = p.matcher(word);
            if (m.matches()) {
                engWords.add(word);
            }
        }
        System.out.println("Words with latin characters only: " + engWords.size());
        int wordCount = 0;

        for (String word : engWords) {
            word = word.toLowerCase();
            int vowel = 0;
            int cons = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                        || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    vowel++;
                } else cons++;
            }
            if (vowel == cons) {
                wordCount++;
            }

        }
        System.out.println("Word with same number of vovwel / cons letters: " + wordCount);
    }


}
