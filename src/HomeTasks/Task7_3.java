package HomeTasks;

public class Task7_3 {
    public static void main(String[] args) {
        String[] strings = Task7_1.strings();
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        int averageLength = (int) totalLength / strings.length;
        System.out.println("Average length: " + averageLength);
        for (String str : strings) {
            if (str.length() > averageLength) {
                System.out.println(str + " with length of " + str.length());
            }
        }
    }
}
