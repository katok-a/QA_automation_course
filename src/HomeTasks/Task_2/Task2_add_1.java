package HomeTasks;

import java.util.Scanner;

public class Task2_add_1 {

    public static int[][] build2d() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of colomns: ");
        int col = scan.nextInt();
        System.out.println("Enter number of rows: ");
        int row = scan.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Array will be filled with random numbers (0-99)");
        for (int f = 0; f < row; f++) {
            for (int i = 0; i < col; i++) {
                arr[f][i] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }


    public static void arr2DPrint(int[][] arr) {
        System.out.println("2D Array");
        for (int f = 0; f < arr.length; f++) {
            for (int i = 0; i < arr[f].length; i++) {
                System.out.print(arr[f][i] + " ");
            }
            System.out.println();
        }
    }
    public static void arr2DReversPrint(int[][] arr) {
        System.out.println("2D Array in revers order");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int f = arr[i].length - 1; f >= 0; f--) {
                System.out.print(arr[i][f] + " ");
            }
            System.out.println();
        }
    }
    public static int[] arrMinMax2D(int[][] arr){
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int f = arr[i].length - 1; f >= 0; f--) {
                if (arr[i][f] > max) {
                    max = arr[i][f];
                }
                if (arr[i][f] < min) {
                    min = arr[i][f];
                }
            }
        }
        int[] out = {min, max};
        return out;
    }

    public static void main(String[] args) {
        int[][] arr = Task2_add_1.build2d();
        arr2DPrint(arr);
        arr2DReversPrint(arr);

        System.out.println("Minimum: " + arrMinMax2D(arr)[0]);
        System.out.println("Maximum: " + arrMinMax2D(arr)[1]);
            }
}

