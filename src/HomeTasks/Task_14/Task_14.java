package HomeTasks.Task_14;

/**
 * Created by kotok_artem on 30.10.2018.
 */
public class Task_14 {
    public static void main(String[] args) {
        Massive mass = new Massive();
        mass.fillArray();
        mass.divideElementByNextElement();
        System.out.println("Partial sum: " + mass.getPartialSum(2));
        mass.getElement(0);


    }

}

