package HomeTasks.Task_13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kotok_artem on 29.10.2018.
 */
public class Task_13_add_1 {
    public static void main(String[] args) {
        ArrayList<Button> listToSort= new ArrayList<>();
        Button button1 = new Button("1");
        Button button2 = new Button("22");
        Button button3 = new Button("333");
        Button button4 = new Button("4444");
        Button button5 = new Button("55555");
        listToSort.add(button3);
        listToSort.add(button2);
        listToSort.add(button5);
        listToSort.add(button1);
        listToSort.add(button4);
        System.out.println(listToSort);
        listToSort = ArrayListSorter.bubleSorter(listToSort);
        System.out.println(listToSort);
    }
}
