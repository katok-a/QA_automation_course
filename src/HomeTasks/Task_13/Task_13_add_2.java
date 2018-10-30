package HomeTasks.Task_13;

import java.util.TreeSet;


import static HomeTasks.Task_13.Task_13.AFTER_FIRST_REMOVE;
import static HomeTasks.Task_13.Task_13.AFTER_FIRST_SET;
import static HomeTasks.Task_13.Task_13.INITIAL;

/**
 * Created by kotok_artem on 29.10.2018.
 */
public class Task_13_add_2 {
    TreeSet<Button> treeSet;

    public void addButton(Button button) {
        treeSet.add(button);
    }

    public void setButton(Button oldButton, Button newButton) {
        treeSet.remove(oldButton);
        treeSet.add(newButton);
    }

    public void removeButton(Button button) {
        treeSet.remove(button);
    }
    public void printAll(){
        treeSet.stream().forEach(System.out::println);
    }

    public static final String TREE_SET = "TreeSet ";

    public static void main(String[] args) {
        Task_13_add_2 treeSetTester = new Task_13_add_2();

        treeSetTester.treeSet = new TreeSet<>();
        Button button1 = new Button("1");
        Button button2 = new Button("22");
        Button button3 = new Button("333");

        treeSetTester.addButton(button1);
        treeSetTester.addButton(button3);
        treeSetTester.addButton(button2);
        treeSetTester.addButton(button1);
        System.out.println(INITIAL + TREE_SET);
        treeSetTester.printAll();
        treeSetTester.removeButton(button3);
        System.out.println(AFTER_FIRST_REMOVE + TREE_SET);
        treeSetTester.printAll();
        treeSetTester.setButton(button2, button3);
        System.out.println(AFTER_FIRST_SET + TREE_SET);
        treeSetTester.printAll();


    }
}
