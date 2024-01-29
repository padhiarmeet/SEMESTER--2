import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        String s2 = null;
        String s3 = Integer.toString(n);
      while (n!=0) {
        int a = n % 10;
        String s1 = Integer.toString(a);
         s2 = s2 + s1;
        n = n/10;
      }
      if(s2.equals(s3)){
        System.out.println("equal");
      }
      else{
        System.out.println("not equal");
      }
        sc.close();
    }
}
