package HomeTasks;

public class Massive {


    public void printMassiveAsLine(int[] arr) {
        System.out.println("Array");
        for (int out : arr) {
            System.out.print(out + " ");
        }
        System.out.println();
    }
    public void printReverseMassiveAsLine(int[] arr) {
        System.out.println("Revers order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int getSumOfElements (int[] arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public int[] multiptyBy3(int[] arr){
        for(int i =0; i<arr.length; i++){
            arr[i]*=3;

        }
        return arr;
    }
}
