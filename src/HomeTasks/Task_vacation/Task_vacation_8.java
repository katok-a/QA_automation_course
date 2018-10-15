package HomeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_vacation_8 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        char[] cons = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        List<Character> consOut = new ArrayList();
        List<String> words = Arrays.asList(text.toString().split("\\s+"));

        for (int i = 0; i < cons.length; i++) {
            int charCount = 0;
            for (int f = 0; f < words.size(); f++) {
                if (words.get(f).indexOf(cons[i]) >= 0) {
                    charCount++;
                }
            }
            if (charCount == 1 || charCount == 2) {
                consOut.add(cons[i]);
            }
        }
        System.out.println("consonants, met  in 1 or 2 words: " + consOut);

    }
}
