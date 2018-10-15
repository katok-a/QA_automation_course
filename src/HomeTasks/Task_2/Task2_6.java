package HomeTasks;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Task2_6 {
    public static int[] rotateNeibours(int[] arr){
        int i = 0;
        while (i <= arr.length - 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i += 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        rotateNeibours(arr);
        System.out.println("Rotate neibours:");
        Task2_1.printArray(arr);

    }
}
