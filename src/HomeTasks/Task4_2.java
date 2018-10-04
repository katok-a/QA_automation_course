package HomeTasks;

public class Task4_2 {
    public static void main(String[] args) {
        Massive massiv = new Massive();
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        massiv.printMassiveAsLine(array);
        massiv.printReverseMassiveAsLine(array);
        System.out.println(massiv.getSumOfElements(array));
        array = massiv.multiptyBy3(array);
        massiv.printMassiveAsLine(array);
        massiv.printReverseMassiveAsLine(array);


    }
}