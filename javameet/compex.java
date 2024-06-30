
import java.util.*;

public class compex {
    static int real1;
    static int imginary1;

    static int real2;
    static int imginary2;

    compex(int a, int b,int c,int d) {

        real1 = a;
        imginary1 = b;
        real2 = c;
        imginary2 =d;
    }

    static void sum(int a, int b,int c,int d) {
       int sum1 =  a+c;
       int sum2 = b+d;
       System.out.println(sum1+sum2+"i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sum(1, 2,5,97898697);
        sc.close();

    }
}
