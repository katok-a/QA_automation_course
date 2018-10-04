package HomeTasks;
// CHANGE FROM GITHUB SITE
// change after clone
import java.util.Scanner;

public class Task2_1 {
    public static int[] builder() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int l = scan.nextInt();
        int[] temp = new int[l];

        System.out.println("Fill array by the hand or with random numbers?" + "\n" + "1 - random" + "\n" + "2 or other - by the hand");

        int way = scan.nextInt();
        switch (way) {
            case 1:
                for (int i = 0; i <= temp.length - 1; i++) {
                    temp[i] = (int) (Math.random() * 10);
                }
                break;
            default:
                for (int i = 0; i <= temp.length - 1; i++) {
                    System.out.println("Enter element Nr " + i);
                    temp[i] = scan.nextInt();
                }
                break;

        }
        return temp;

    }

    public static int[] randomArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println("Array");
        for (int out : arr) {
            System.out.print(out + " ");
        }
        System.out.println();
    }

    public static void printArrayRevers(int[] arr) {
        System.out.println("Revers order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = Task2_1.builder();
        Task2_1.printArray(arr);
        Task2_1.printArrayRevers(arr);

    }
}
