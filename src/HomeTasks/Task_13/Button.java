package HomeTasks.Task_13;

public class Button implements Comparable<Button> {
    String name;
    boolean action;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }


    public boolean equals(Button button) {
        if (this.name.equals(button.name) && this.action == button.action) {
            return true;
        }
        return false;
    }


    @Override
    public int compareTo(Button obj) { // sort by Name length.
        if(this.name.length()<obj.name.length()){
            return -1;
        }
        if(this.name.length()>obj.name.length()){
            return 1;
        }
        return 0;
    }

}


