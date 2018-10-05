package HomeTasks;

/**
 * Created by kotok_artem on 05.10.2018.
 */
public class Task5_add_2 {
    public static int[] insertionSort(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int check = i; arr[check - 1] > arr[check]; check--) {
                temp = arr[check];
                arr[check] = arr[check - 1];
                arr[check - 1] = temp;
                if (check == 1) {
                    break;
                }
            }
        }
        return arr;
    }
    // Merge sort and Shell sort are too hard for me to code right now. Will not be able to code them till deadline.

    public static void main(String[] args) {
        int arrayLength = 10;
        int[] arr = Task2_1.randomArray(arrayLength );
        Task2_1.printArray(arr);
        Task5_add_2.insertionSort(arr);
        Task2_1.printArray(arr);
    }
}
