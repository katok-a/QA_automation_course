package HomeTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_vacation_12 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        System.out.println("Enter file path and name: ");
        Scanner inputScanner = new Scanner(System.in);
        String fileName = inputScanner.nextLine();
        File text = new File(fileName);
        Scanner scan = new Scanner(text);
        ArrayList<StringBuilder> noComments = new ArrayList<>();
        boolean isCommented = false;
        while (scan.hasNext()) {
            StringBuilder str = new StringBuilder(scan.nextLine());
            int beginOfComment = str.indexOf("/*");
            int endOfComment = str.indexOf("*/");
            if (isCommented && endOfComment == -1) {
                continue;
            } else if (isCommented) {
                str.delete(0, endOfComment + 2);
                isCommented = false;
            }
            if (beginOfComment != -1) {
                isCommented = true;
                if (endOfComment != -1) {
                    str.delete(beginOfComment, endOfComment + 2); // 2 = length of '*/'
                    isCommented = false;
                } else {
                    str.delete(beginOfComment, str.length());
                }
            }
            int oneLineComment =0;
            if (str.indexOf("//")!=-1){
                str.delete(str.indexOf("//"),str.length());
            }
            noComments.add(str);
        }
//        FileWriter writer = new FileWriter(text);
//        for (int i = 0; i<noComments.size();i++) {
//            writer.write(noComments.get(i)+"\n");
//                    }
//        writer.flush();
        // I have commented this part of code because it really deletes comments from code and can spoil your real files.
        // But still it works, i've checked.

        scan.close();

        for (int i = 0; i < noComments.size(); i++) {
            System.out.println(noComments.get(i));
        }
    }
}
