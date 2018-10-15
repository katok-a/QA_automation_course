package HomeTasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task_vacation_6 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        List<String> textList = Arrays.asList(text.toString().split("\\s+")).stream().collect(Collectors.toList());
       // no distinct here.
        List<String> uniqueWords = Arrays.asList(text.toString().split("\\s+")).stream().distinct().collect(Collectors.toList());
        // Ulyana, comment for me mostly. I am going to reuse with code later and want it to be clear. Do you see any mistakes in there?
        //Arrays.asList - transform smthng to List. Here - String array.
        // (text.toString() - transform StringBuilder to String, because StringBuilder doesn't have SPLIT method.
        // .split("\\s+")) - split String into Array of Strings by SPACE
        // stream() - create stream from List (collection) of Strings.
        // .distinct() - kill duplicates.
        // collect(Collectors.toList()) - collect to List.
        for (int i =0;i<uniqueWords.size();i++){
            int matches = Collections.frequency(textList,uniqueWords.get(i));
            System.out.println("Word "+uniqueWords.get(i)+" seen "+matches + " times");
        }

    }
}
