package HomeTasks.Task_10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kotok_artem on 22.10.2018.
 */
public class Paragraph {
    public ArrayList<String> getPlainText() {
        TextHelper helper = new TextHelper();
        ArrayList<String> plainText = helper.getText();
        return plainText;
    }

    ArrayList<String> split(ArrayList<String> inputText) {
        ArrayList<String> splitedToSentence = new ArrayList<String>();
        for (String str : inputText) {

            splitedToSentence.addAll(Arrays.asList(str.split("\\.|\\!|\\?")));
        }

        return splitedToSentence;
    }


}
