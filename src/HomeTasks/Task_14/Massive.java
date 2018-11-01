package HomeTasks.Task_14;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by kotok_artem on 30.10.2018.
 */
public class Massive {

    public Massive() {
        this.array = new int[arrayLength];
    }

    public int[] array;
    int arrayLength = arrayLengthReader();
    int sumOfElements = 0;
    public static final String NOT_INTEGER = "NOT Integer. Try again";


    public int arrayLengthReader() {
        Scanner scan = new Scanner(System.in);
        int arrayLength = 0;
        try {
            System.out.println("Enter array length: (Enter Not numbers to get exception)");
            arrayLength = scan.nextInt();
            return arrayLength;
        } catch (InputMismatchException ex) {
            System.out.println(NOT_INTEGER );
        }

        return arrayLengthReader();
    }

    public void fillArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element Nr. " + i + " (Enter Not numbers to get exception.)");
            array[i] = getElement();
        }
    }

    public int getElement() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());

        } catch (IOException ex) {
            System.out.println("Reader failed.");
            return getElement();

        } catch (NumberFormatException ex) {
            System.out.println(NOT_INTEGER );
            return getElement();
        }
    }

    public void divideElementByNextElement() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter element position. It will be divided by next element in Array. (Enter OutOfArray of followed by Zero position to get exception.)");
            int position = scanner.nextInt();
            System.out.println("Division result: " + array[position] / array[position + 1]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error." + ex.getMessage());
        } finally {
            System.out.println("Finally block demonstration message.");
        }

    }

    public int getElement(int index) {
        int element;
        try {
            element = array[index];
            System.exit(7);
        } catch (ArrayIndexOutOfBoundsException ex) {
            element = 0;
            System.exit(7);
        } finally {
            System.out.println("This will never show.");
        }

        return element;
    }

    public int getPartialSum(int index) {

        try {

            for (int i = 0; i < index; i++) {
                sumOfElements += array[i];
            }

            try {
                FileWriter writer = new FileWriter("T:\\Java\\sum.txt");
                writer.write(sumOfElements);
                writer.close();
            } catch (IOException ex) {
                System.out.println("File not created.");
            }
            return sumOfElements;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index out of Array");
            return 0;
        }
    }
}




