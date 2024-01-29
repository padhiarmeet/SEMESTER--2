import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);

       System.out.println("enter your age");   
        int age=sc.nextInt();
       

      if(age>18){
        System.out.println("adult chhe ho..");
      }
      else{
        System.out.println("nathi adult ho...");
      }
      System.out.println("tame 1 number nakhajo ho...");
      Scanner mc=new Scanner(System.in);
      int kc=mc.nextInt();

      if(kc % 2 ==0){
        System.out.println("even chhe bhai...");
      }
      else{
        System.out.println("odd chhe bhai...");
      }
    
      
    }
}