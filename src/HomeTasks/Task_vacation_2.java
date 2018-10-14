package HomeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_vacation_2 {
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Substring to amend? ");
        String amend = scan.nextLine();
        System.out.println("What to add? ");
        String wordToAdd = scan.nextLine();
        scan.close();
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(text.toString().split("\\s+")));
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith(amend))
                words.add(i + 1, wordToAdd);
        }
        words.stream().forEach(word -> System.out.print((word) + " "));

    }
}
