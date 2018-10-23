package HomeTasks.Task_10;

import java.util.ArrayList;
import java.util.Arrays;

import static HomeTasks.Task_10.SymbloToReplace.replacementSymbol;

/**
 * Created by kotok_artem on 22.10.2018.
 */
public class Word extends Sentence {
    ArrayList<StringBuilder> splitedToWordsSB = new ArrayList<StringBuilder>();

    public Word(ArrayList<String> splitedToWords) {
        for (String word : splitedToWords) {
            if (word.length() > 0) {
                StringBuilder temp = new StringBuilder(word);
                splitedToWordsSB.add(temp);
            }
        }
        this.splitedToWordsSB = splitedToWordsSB;
    }
    TextHelper helper = new TextHelper();
    int symbolToReplacePosition=helper.getSymbolToReplacePosition();

    static ArrayList<StringBuilder> replace(ArrayList<StringBuilder> splitedToWords) {
        TextHelper helper = new TextHelper();
        helper.setSymbolToReplacePosition();
        int symbolToReplacePosition=helper.getSymbolToReplacePosition();

        ArrayList<StringBuilder> replacedWords = (ArrayList<StringBuilder>) splitedToWords.clone();
        for (StringBuilder str : replacedWords) {
            if (str.length() >= symbolToReplacePosition) {
                for(int i =symbolToReplacePosition-1;i<str.length();i+=symbolToReplacePosition){
                    str.setCharAt(i,replacementSymbol);                }
            }
        }
        return replacedWords;
    }
}
