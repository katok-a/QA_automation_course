package HomeTasks;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by kotok_artem on 11.10.2018.
 */
public class Task_vacation_3 {
    public static StringBuilder funWithSymbol(StringBuilder text, char symbol, int way) {
        if (way == 0) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == symbol) {
                    text.deleteCharAt(i);
                    i--;
                }
            }
            return text;
        }
        if (way == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter position to append:");
            int position = scan.nextInt();
            scan.close();
            if (position > text.length()) {
                System.out.println("Text to short.");
                return text = null;
            }
            for (int i = position - 1; i < text.length(); i += position) {
                text.insert(i, symbol);
            }

        }
        return text;
    }


    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        StringBuilder out = funWithSymbol(text, '!', 1);
        System.out.println("Text after appending: " + out);
        out = funWithSymbol(text, '!', 0);
        System.out.println("Text after removing: " + out);


    }
}
