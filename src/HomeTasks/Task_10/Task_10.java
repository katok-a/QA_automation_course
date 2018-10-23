package HomeTasks.Task_10;

import java.util.ArrayList;

/**
 * Created by kotok_artem on 22.10.2018.
 */
public class Task_10 {
    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph();
        ArrayList<String> plainText = paragraph.getPlainText();
        ArrayList<String> splitedToSentence = paragraph.split(plainText);
        Sentence sentence = new Sentence();
        ArrayList<String> splitesToWords = sentence.split(splitedToSentence);
        Word words = new Word(splitesToWords);
        System.out.println(Word.replace(words.splitedToWordsSB));
        // This is a test string number 1.
//This is a testing sting number two? With two sentence.
//Now you see test string three. Tree sentences? More.

    }
}
