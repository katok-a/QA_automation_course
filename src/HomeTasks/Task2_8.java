package HomeTasks;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Task2_8 {
    public static void minMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int maxPosition = 0;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; //determine Max array value
                maxPosition = i; //determine Max value position
            }
            if (arr[i] < min) {
                min = arr[i]; //determine Min array value
                minPosition = i; //determine Min value position
            }
        }
        System.out.println("Maximum: " + max + " at position " + maxPosition);
        System.out.println("Minimum: " + min + " at position " + minPosition);
    }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        Task2_8.minMax(arr);
    }
}
