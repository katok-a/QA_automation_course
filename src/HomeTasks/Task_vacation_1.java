package HomeTasks;

import java.util.Scanner;

/**
 * Created by kotok_artem on 10.10.2018.
 */
public class Task_vacation_1 {
    public static StringBuilder textBuilder(){
        System.out.println("Enter text");
        Scanner scaner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scaner.nextLine());
        return text;
    }
    public static void main(String[] args) {
        StringBuilder text = Task_vacation_1.textBuilder();
        System.out.println("Position to insert? >0");
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();
        scan.nextLine();
        if (position>text.length()){
            System.out.println("Text to short.");
            return;
        }
        System.out.println("Substring to insert? ");
        String appendix = scan.next();
        scan.close();
        for (int i =position-1;i<text.length();i=i+appendix.length()+position){
            text.insert(i, appendix);
            }
        System.out.println("Text after insertion: " + text);


    }
}
