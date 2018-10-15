package HomeTasks;

public class Task2_2 {
    public static void arrMultiply(int[] arr){
        int mult = 1;
        for (int temp : arr) {
            mult *= temp;
        }
        System.out.println(mult);
    }

    public static void main(String[] args) {
        int[] arr = HomeTasks.Task2_1.builder();
        Task2_1.printArray(arr);
        Task2_2.arrMultiply(arr);
    }
}

