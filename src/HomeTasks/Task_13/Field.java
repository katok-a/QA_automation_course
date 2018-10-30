package HomeTasks.Task_13;

public class Field {
    int id;
    String value;

    public Field(String value){
        this.value =value;
    }

    @Override
    public String toString() {
        return this.value;
    }


    public boolean equals(Field field) {
        if (this.id==field.id&&this.value.equals(field.value)){
            return true;
        }
        return false;
    }
}

