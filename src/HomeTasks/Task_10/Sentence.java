package HomeTasks.Task_10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kotok_artem on 22.10.2018.
 */
public class Sentence extends Paragraph {
    @Override
    protected ArrayList<String> split(ArrayList<String> inputText) {

        ArrayList<String> splitedToWords = new ArrayList<String>();

        for (String str : inputText) {

            splitedToWords.addAll(Arrays.asList(str.split("\\s+")));
        }
        return splitedToWords;
    }
}
