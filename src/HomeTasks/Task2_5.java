package HomeTasks;

import java.util.ArrayList;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Task2_5 {
    public static void zeroPositions(int[] arr) {
        //easy mode - 0 positions are not saved or reusable;
        boolean isZero = false;
        for (int temp = 0; temp < arr.length; temp++) {
            if (arr[temp] == 0) {
                System.out.println("Zero at position: " + temp);
                isZero = true;
            }
        }
        if (!isZero) {
            System.out.println("NONE zero in array.");
        }
    }

    public static ArrayList<Integer> zeroPositions2(int[] arr) {
        //hard mode - 0 positions saved and returned as ArrayList
        ArrayList<Integer> positions = new ArrayList<>();
        boolean isZero = false;
        for (int temp = 0; temp < arr.length; temp++) {
            if (arr[temp] == 0) {
                positions.add(temp);
                isZero = true;
            }
        }
        if (positions.isEmpty()) {
            System.out.println("NONE zero in array.");
        } else {
            System.out.print("Zero at positions: ");
        }

        for (int i : positions) {
            System.out.print(i + ", ");
        }
        return positions;
    }

    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        zeroPositions(arr);
        zeroPositions2(arr);

    }

}




