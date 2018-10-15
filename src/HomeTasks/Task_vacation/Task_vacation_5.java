package HomeTasks;

import java.util.Scanner;

/**
 * Created by kotok_artem on 11.10.2018.
 */
public class Task_vacation_5 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting symbol: ");
        char start = scan.next().charAt(0);
        System.out.println("Enter closing symbol: ");
        char close = scan.next().charAt(0);
        int i = 0;
        int startIndex = 0;
               for (i = 0; i < text.length(); i++) {
            if (text.charAt(i) == start) {
                startIndex = i;
                break;

            }
        }
        int closeIndex = startIndex;
        for (i = startIndex + 1; i < text.length(); i++) {
            if (text.charAt(i) == close) {
                closeIndex = i+1;
                break;
            }
        }
        text.delete(startIndex, closeIndex);
        System.out.println("Text after extraction: " + text);

    }
}
