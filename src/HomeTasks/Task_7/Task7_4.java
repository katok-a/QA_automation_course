package HomeTasks;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task7_4 {
    public static String[] words() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int numberOfWords = scan.nextInt();

        String[] words = new String[numberOfWords];
        System.out.println("Any symbols after SPACE will be ignored");
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Type word Nr. " + i);
            words[i] = scan.next();
        }
        scan.close();
        return words;
    }

    public static void main(String[] args) {
        String[] words = words();
        int mixValue = words[0].length();
        int mixValuePosition = 0;
        for (int i = 0; i < words.length; i++) {
            if ((int) words[i].chars().distinct().count() < mixValue) {
                mixValue = (int) words[i].chars().distinct().count();
                mixValuePosition = i;
            }

        }
        System.out.println("Word with minimum unique characters: " + words[mixValuePosition]);

    }


}

