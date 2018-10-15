package HomeTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task2_add_2 {
    public static ArrayList<Integer> arrListBuilder() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ArrayList initial size: ");
        int l = scan.nextInt();
        ArrayList<Integer> temp = new ArrayList<>();

        System.out.println("Array will be filled with random numbers (0-99)");

        for (int i = 0; i < l; i++) {
                    temp.add(0, (int) (Math.random() * 100));
                }
        return temp;

    }
    public static void arrListPrinter(ArrayList<Integer> arrList){
        System.out.println("ArrayList");
        for (int i :arrList) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> arrListAdd(ArrayList<Integer> arrList, int add){
        for(int i :arrList){
            int currentIndex = arrList.indexOf(i);
            arrList.set(currentIndex, i+=add);

        }
        return arrList;
    }
    public static ArrayList<Integer> removaAll(ArrayList<Integer> arrList){
        Iterator it = arrList.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();
        }

        return arrList;
    }
    public static ArrayList<Integer> removaAllAtOnce(ArrayList<Integer> arrList) {
        for(Integer i : new ArrayList<>(arrList)) {
            arrList.clear();
        }
        return arrList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = Task2_add_2.arrListBuilder(); // creat list 1
        arrListPrinter(arrList); // print list 1
        ArrayList<Integer> arrList2 =  new ArrayList<>(arrList); // create List 2 with same content;
        arrList = arrListAdd(arrList, 5); // add 5 to each element of List 1
        arrListPrinter(arrList); // print list 1 after (+5)
        removaAll(arrList); // remove everything form List 1;
        arrListPrinter(arrList); // print list 1 after removing;
        arrListPrinter(arrList2); // print List 2
        removaAllAtOnce(arrList2);// remove everything form List 2;
        arrListPrinter(arrList2); // print list 2 after removal;


    }
}
