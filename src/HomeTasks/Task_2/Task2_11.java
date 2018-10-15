package HomeTasks;

public class Task2_11 {
    public static int[] halfSum(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array to short. 3 elements required.");
            return arr;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = (arr[i - 1] + arr[i + 1]) / 2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        halfSum(arr);
        Task2_1.printArray(arr);

    }

}
