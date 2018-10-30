package HomeTasks.Task_13;

import java.util.ArrayList;

/**
 * Created by kotok_artem on 29.10.2018.
 */
public class ArrayListSorter {
    public static ArrayList<Button> bubleSorter(ArrayList<Button> ListToSort){
                for(int i =0; i <ListToSort.size(); i++){
            Button temp;
            for (int t=0; t<ListToSort.size()-i-1;t++ ){
                if(ListToSort.get(t).compareTo(ListToSort.get(t+1))>0){
                    temp = ListToSort.get(t);
                    ListToSort.set(t,ListToSort.get(t+1));
                    ListToSort.set(t+1,temp);
                }

            }

        }

        return ListToSort;
    }
}
