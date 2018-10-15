package HomeTasks;

public class Task2_3 {
public static int[] arrEach3Multiply(int[] arr){
    int[] newArr = new int[arr.length];
    for (int temp = 0; temp <= arr.length - 1; temp++) {
        if (temp % 3 == 0) {
        newArr[temp] = arr[temp] * 2;}
        else {newArr[temp] = arr[temp];
        }
    }
    return newArr;
    }
    public static int[] arrEach3Multiply2(int[] arr) {
        int temp =0;
        while (temp<=arr.length-1){
            arr[temp] = arr[temp] * 2;
            temp+=3;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        System.out.println("Each 3 x2:");
        arr=arrEach3Multiply(arr);
        Task2_1.printArray(arr);
        System.out.println("Each 3 x2: second way"); // in fact each 3rd is multiplied by 4 here;
        arr=arrEach3Multiply2(arr);
        Task2_1.printArray(arr);


    }
}
