package HomeTasks.Task_13;

import java.io.BufferedReader;
import java.util.*;

public class Page {
    ArrayList<Button> buttons = new ArrayList<>();
    LinkedList<Field> fields = new LinkedList<>();
    HashSet<Label> labels = new HashSet<>();
    HashMap<Integer, Dropdown> dropdowns = new HashMap<>();
    float id;
    String title;

    //buttons
    public void add(Button button) {
        buttons.add(button);
    }

    public void removeFirst(Button button) {
        buttons.remove(button);
    }

    public void removeAll(Button button) {
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).equals(button)) {
                buttons.remove(i);
                i--;
            }
        }
    }

    public void setFirst(Button oldButton, Button newButton) {
        int indexToReplace = buttons.indexOf(oldButton);
        if (indexToReplace == -1) {
            return;
        }
        buttons.set(indexToReplace, newButton);
    }

    public void setAll(Button oldButton, Button newButton) {
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).equals(oldButton)) {
                buttons.set(i, newButton);
            }
        }

    }

    public void printAll(Button button) {
        buttons.stream().forEach(System.out::println);
    }

    //fields
    public void add(Field field) {
        fields.add(field);
    }

    public void removeFirst(Field field) {
        fields.remove(field);
    }

    public void removeAll(Field field) {
        for (int i = 0; i < fields.size(); i++) {
            if (fields.get(i).equals(field)) {
                fields.remove(i);
                i--;
            }
        }
    }

    public void setFirst(Field oldfield, Field newField) {
        int indexToReplace = fields.indexOf(oldfield);
        if (indexToReplace == -1) {
            return;
        }
        fields.set(indexToReplace, newField);
    }

    public void setAll(Field oldField, Field newField) {
        for (int i = 0; i < fields.size(); i++) {
            if (fields.get(i).equals(oldField)) {
                fields.set(i, newField);
            }
        }

    }

    public void printAll(Field field) {
        fields.stream().forEach(fieldOut -> System.out.println(fieldOut));
    }

    //labels
    public void add(Label label) {
        labels.add(label);
    }

    public void remove(Label label) {
        labels.remove(label);
    }

    public void set(Label oldLabel, Label newLabel) {
        labels.remove(oldLabel);
        labels.add(newLabel);
    }

    public void printAll(Label label) {
        for (Label labelOut : labels) {
            System.out.println(labelOut);
        }
    }

    //dropdowns
    public void add(Integer k, Dropdown dropdown) {
        dropdowns.put(k, dropdown);
    }

    public void removeFirst(Dropdown dropdown) {

        for (Map.Entry entry : dropdowns.entrySet()) {
            if (entry.getValue().equals(dropdown)) {
                dropdowns.remove(entry.getKey());
                return;
            }
        }
    }

    public void removeAll(Dropdown dropdown) {
        Iterator iterator = dropdowns.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (entry.getValue().equals(dropdown)) {
                iterator.remove();
            }
        }
    }

    public void setFirst(Dropdown oldDropdown, Dropdown newDropdown) {
        for (Map.Entry entry : dropdowns.entrySet()) {
            if (entry.getValue().equals(oldDropdown)) {
                dropdowns.put(Integer.parseInt(entry.getKey().toString()), newDropdown);
                return;
            }
        }
    }

    public void setAll(Dropdown oldDropdown, Dropdown newDropdown) {
        for (Map.Entry entry : dropdowns.entrySet()) {
            if (entry.getValue().equals(oldDropdown)) {
                dropdowns.put(Integer.parseInt(entry.getKey().toString()), newDropdown);
            }
        }
    }


    public void printAll(Dropdown dropdown) {
        System.out.println(dropdowns);

    }


}

