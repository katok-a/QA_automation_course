package HomeTasks.Task_16;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kotok_artem on 01.11.2018.
 */
public class Massive {
    public int intLength;
    public int stringLength;
    public int[] intArray;
    public String[] stringArray;
    public String str;

    public Massive() {
    }

    public Massive(int[] array) {
        this.intArray = array;
        this.intLength = array.length;
    }

    public Massive(String[] array) {
        this.stringArray = array;
        this.stringLength = array.length;
    }

    //1 - Words in String count
    public int wordsInString() throws NullPointerException{
        return str.split("\\s+").length;
    }

    //2 - Words in String count reloaded
    public int wordsInString(String str) {
        return str.split("\\s+").length;
    }

    //3 - Bubble sort
    public int[] bubbleSort() {
        for (int i = 0; i < intArray.length; i++) {
            for (int k = 1; k < intArray.length - i; k++) {
                if (intArray[k - 1] > intArray[k]) {
                    int temp = intArray[k - 1];
                    intArray[k - 1] = intArray[k];
                    intArray[k] = temp;
                }
            }
        }
        return intArray;
    }

    //4 - Insertion Sort
    public int[] insertionSort() {
        int temp = 0;
        for (int i = 1; i < intArray.length; i++) {
            for (int check = i; intArray[check - 1] > intArray[check]; check--) {
                temp = intArray[check];
                intArray[check] = intArray[check - 1];
                intArray[check - 1] = temp;
                if (check == 1) {
                    break;
                }
            }
        }
        return intArray;
    }

    //5 - MinMax Sort
    public int[] minMaxSorting() {
        int tempMin = 0;
        int tempMax = 0;
        for (int i = 0; i < intArray.length; i++) {
            int max = intArray[i];
            int min = intArray[i];
            int maxPosition = i;
            int minPosition = i;

            for (int t = i; t < intArray.length; t++) {
                if (intArray[t] > max) {
                    max = intArray[t];
                    maxPosition = i;
                }
                if (intArray[t] < min) {
                    min = intArray[t];
                    minPosition = t;
                }
            }
            tempMin = intArray[minPosition];
            intArray[minPosition] = intArray[i];
            intArray[i] = tempMin;

            tempMax = intArray[maxPosition];
            intArray[maxPosition] = intArray[intArray.length - i - 1];
            intArray[i] = tempMax;
        }
        return intArray;
    }

    //6 - Digits in Int
    public int digitsInInt(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    //7 Primal number
    public boolean isPrime(int number) {
        if (number < 1) return false;
        if (number < 4) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    //8 Count Prime numbers in array
    public int countPrimeNumbers() {
        int result = 0;
        for (int i : intArray) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    //9 Boolean - only Even numbers
    public boolean isOnlyEven() {
        for (int i : intArray) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //10 Boolean equal Odd and Even
    public boolean isOddEqualEven() {
        if (intArray.length % 2 != 0) {
            return false;
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i : intArray) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return (evenCount == oddCount);
    }

    //11 EvenOddRatio
    public double evenOddRatio() {
        int evenCount = 0;
        int oddCount = 0;
        for (int i : intArray) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return (double)evenCount / oddCount;
    }

    //12 - Words in Array count
    public int wordsInArray() {
        int result = 0;
        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].length() != 0) {
                result += stringArray[i].trim().split("\\s+").length;
            }
        }
        return result;
    }

}


