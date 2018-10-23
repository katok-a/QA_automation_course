package HomeTasks.Task_10;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kotok_artem on 23.10.2018.
 */
public class TextHelper extends SymbloToReplace implements getText {
    public ArrayList<String> getText() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> paragraphs = new ArrayList<>();
        String paragraph;
        System.out.println("Enter text. Split paragraphs by 'Enter'. Double-press Enter to finish.");

        do {
            paragraph = scan.nextLine();
            paragraphs.add(paragraph);
        }
        while (paragraph.length() != 0);

        return paragraphs;
    }


    private int symbolToReplacePosition;

    public void setSymbolToReplacePosition() {
        System.out.println("Enter position to replace: ");
        Scanner scan = new Scanner(System.in);
        symbolToReplacePosition = scan.nextInt();
        scan.close();
        ;
    }

    public int getSymbolToReplacePosition() {
        return symbolToReplacePosition;
    }

    ArrayList<String> split(ArrayList<String> inputText) {
        ArrayList<String> splitedToSentence = new ArrayList<String>();
        for (String str : inputText) {

            splitedToSentence.addAll(Arrays.asList(str.split("\\.|\\!|\\?")));
        }

        return splitedToSentence;
    }

}
