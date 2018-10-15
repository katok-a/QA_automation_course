public class Task1_4 {
    public static void main(String[] args) {
        
    //A
    int i = 40000;
    short s = 256;
    long l = 50000L;
    double d = 7.62;
    float f = 12.5f;
    char c = 'a';
    boolean isTrue = true;

    //Б
    int result1=i+s;
    double result2 = (l-d);
    double result3=(f*d);
    boolean result4=(l>d);
    boolean result5=(f<i);
    boolean result6=(i==s);
    boolean result7=(d!=f);

    //B
        System.out.println(i+" "+s+" "+l+" "+d+" "+f+" "+c+" "+isTrue);
        System.out.print(result1+" "+result2+" "+result3+" "+result4+" "+result5+" "+result6+" "+result7);
        System.out.printf("\n"+"%08d",i);

    }
}

