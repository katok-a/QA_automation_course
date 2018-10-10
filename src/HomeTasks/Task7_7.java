package HomeTasks;

/**
 * Created by kotok_artem on 09.10.2018.
 */
public class Task7_7 {
    public static void main(String[] args) {
        String[] words = Task7_4.words();
        for(String word:words){
            if(word.length()==word.chars().distinct().count()){
                System.out.println("First word of different symbols: "+ word);
                return;
            }
        }
        System.out.println("None word found.");
    }
}

