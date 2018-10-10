package HomeTasks;

/**
 * Created by kotok_artem on 09.10.2018.
 */
public class Task7_6 {
    public static void main(String[] args) {
        String[] words = Task7_4.words();

        for (String word : words) {
            int count =0;
            for (int i = 0; i < word.length() - 1; i++) {
                int charCode = word.charAt(i);
                int nextCharCode = word.charAt(i + 1);
                if (charCode != nextCharCode - 1) {
                    break;
                }
                count++;
                if(count==word.length()-1){
                System.out.println("Word found: " + word);
                return;}
            }
        }
    }
}
