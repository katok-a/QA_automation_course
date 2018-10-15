package HomeTasks;

public class Task2_12 {
    public static int[] arr2Move(int[] arr){
        if (arr.length < 3) {
            for (int out : arr) {
                System.out.print(out + " ");
            }
            return arr;
            // for 1 and 2 elements array does not change.
        }
        int temp0 = arr[arr.length-2];
        int temp1 = arr[arr.length-1];
        for (int i = arr.length-3; i>=0;i--){
            arr[i+2]=arr[i];
        }
        arr[0]=temp0;
        arr[1]=temp1;
        // I know it's stupid. :(
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        System.out.println("Move ->+2");
        arr2Move(arr);
        Task2_1.printArray(arr);

    }
}
