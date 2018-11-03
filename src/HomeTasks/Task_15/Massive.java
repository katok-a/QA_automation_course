package HomeTasks.Task_15;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kotok_artem on 01.11.2018.
 */
public class Massive {
    public int length;
    public int[] array = new int[length];

    public Massive() {
    }

    ;

    public Massive(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    public int sumOfElements() {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    public double averageValue() throws ArithmeticException {
        return sumOfElements() / array.length;
    }

    public boolean isAscending() throws ArrayIndexOutOfBoundsException {

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] reversArray(int[] initialArray) {
        int result[] = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            result[i] = initialArray[initialArray.length - 1 - i];
        }
        return result;
    }

    public int minMaxDifference() {
        ArrayList<Integer> tempList = new ArrayList<>();
        Arrays.stream(array).forEach(tempList::add); // WOW, It works!
        return Collections.max(tempList) - Collections.min(tempList);
    }
}


