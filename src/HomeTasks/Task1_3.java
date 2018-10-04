public class Task1_3 {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println ("Two numbers required");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println ("Summ=" + (a+b));
        System.out.println ("Difference=" + (a-b));
        System.out.println ("Composition=" + (a*b));

        if (b!=0)System.out.println ("Quotient=" + (a/b));
        else {System.out.println ("Can not divide by zero");
        }
    }
}
