package HomeTasks.Task_13;

import java.util.List;

public class Dropdown {
    List<String> action;
    boolean isSelected;
    String name;

    public Dropdown(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
