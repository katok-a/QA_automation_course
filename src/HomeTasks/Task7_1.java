package HomeTasks;

import java.util.Scanner;

public class Task7_1 {
    public static String[] strings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        int numberOfStrings = scan.nextInt();
        scan.nextLine();
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Type string Nr. " + i);
            strings[i] = scan.nextLine();
        }
        scan.close();
        return strings;
    }

    public static void printStringArray(String[] strings) {
        for (String out : strings) {
            System.out.println(out);
        }
    }

    public static void main(String[] args) {
        String[] strings = strings();
        String shortest = strings[0];
        int shortestPosition = 0;
        String longest = strings[0];
        int longestPosition = 0;
        for (int i = 0; i < strings.length; i++) {
            if (shortest.length() > strings[i].length()) {
                shortest = strings[i];
                shortestPosition = i;
            }
            if (longest.length() < strings[i].length()) {
                longest = strings[i];
                longestPosition = i;
            }
        }
        String atPosition = " at position: ";
        System.out.println("Shortest: " + strings[shortestPosition] + atPosition + shortestPosition);
        System.out.println("Longest: " + strings[longestPosition] + atPosition + longestPosition);
    }
}


