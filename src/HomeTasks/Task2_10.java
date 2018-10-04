package HomeTasks;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Task2_10 {
    public static boolean isRising(int [] arr){
        boolean isRising = true;
        int start = arr[0];
        for (int temp : arr) {
            if (temp < start) {
                isRising = false;
                break;
            }
            start = temp;
        }
        return isRising;
    }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
       if (Task2_10.isRising(arr)) {
       System.out.println("Array is rising.");
        } else {
            System.out.println("Array is NOT rising.");
        }
    }
}
