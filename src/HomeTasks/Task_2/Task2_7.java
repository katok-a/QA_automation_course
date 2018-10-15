package HomeTasks;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Task2_7 {
    public static int[] arrRevers(int[] arr){
        int rounds = arr.length / 2;
        int size = arr.length;
        for (int r = 0; r < rounds; r++) {
            int temp = arr[r];
            arr[r] = arr[size - 1 - r];
            arr[size - 1 - r] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        System.out.println("REVERS");
        arrRevers(arr);
        Task2_1.printArray(arr);
    }
}
