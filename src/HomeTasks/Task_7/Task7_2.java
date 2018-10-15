package HomeTasks;

public class Task7_2 {
    public static void main(String[] args) {
        String[] strings = Task7_1.strings();
        String temp = null;
        for (int i = 0; i < strings.length; i++) {
            for (int t = 0; t < strings.length - 1 - i; t++) {
                if (strings[t].length() > strings[t + 1].length()) {
                    temp = strings[t];
                    strings[t] = strings[t + 1];
                    strings[t + 1] = temp;
                }
            }
        }
        Task7_1.printStringArray(strings);
    }
}

