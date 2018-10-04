package HomeTasks;

import java.util.logging.SocketHandler;

/**
 * Created by kotok_artem on 27.09.2018.
 */
public class Task3_1 {
    public static int minimum(int a, int b){
        return Math.min(a, b);
    }
    public static boolean isEven(int a){
        return (a%2==0)?true:false;

    }
    public static int square(int a){
        return a*a;
    }
    public static int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        int example1 = (int)(Math.random()*10);
        int example2 = (int)(Math.random()*10);
        String int1Intro = "Int Nr. 1: ";
        String int2Intro = "Int Nr. 2: ";
        System.out.println(int1Intro +example1);
        System.out.println(int2Intro +example2);
        System.out.println("Minimum: " + minimum(example1,example2));
        System.out.println("Even:");
        System.out.println(int1Intro+isEven(example1));
        System.out.println(int2Intro+isEven(example2));
        System.out.println("Square:");
        System.out.println(int1Intro+square(example1));
        System.out.println(int2Intro+square(example2));
        System.out.println("Cube:");
        System.out.println(int1Intro+cube(example1));
        System.out.println(int2Intro+cube(example2));

    }
}
