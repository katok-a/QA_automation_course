package HomeTasks;

/**
 * Created by kotok_artem on 25.09.2018.
 */
public class Task2_4 {
    public static void zeroCount(int[] arr){
        int zero_count=0;
        int i =0;
        while (i<arr.length){
            if (arr[i]==0) {
                zero_count++;
            }
        i++;}
        if (zero_count==0){
            System.out.println("None zero in array");
        }
        else {
            System.out.println(zero_count + " zero in array");}

        }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        Task2_4.zeroCount(arr);

    }
}
