import java.util.Scanner;

public class Lab_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ketala number nakhava chhe maro bhai....");
        int q  = sc.nextInt();
        int a[] = new int[q];
        int sum = 0;

        for (int i = 0; i < q; i++) {

            System.out.println("kaik nakho bhai...");
            a[i] = sc.nextInt();

            try {

                if (a[i] < 0) {
                    throw new NumberNotZero();
                }
                if (a[i] % 10 == 0) {
                    throw new NumberDivTen();
                }
                if(a[i]>1000 && a[i]<2000){
                    throw new NumberGreterLess();
                } 
                if(a[i]>7000){
                    throw new NumberGretter700();
                }
                else {
                    sum = sum + a[i];
                }
            }
             catch (NumberNotZero n) {
                System.out.println(n.getCause());
            } 
            catch(NumberGreterLess gl){
                System.out.println(gl.getMessage());
            }
            catch(NumberDivTen ten){
                System.out.println(ten.getMessage());
            }
            catch(NumberGretter700 seven){
                System.out.println(seven.getMessage());
            }
        }
        System.out.println("tamaro total thai chhe - "+sum);
        sc.close();
    }
}

class NumberNotZero extends Exception {
    NumberNotZero() {

        super("Y zero thi nano the jo to khara...");
    }
}

class NumberDivTen extends Exception {
    NumberDivTen() {
        super("Number is divisible by ten chhe maro bhai....");
    }
}

class NumberGreterLess extends Exception{
    NumberGreterLess(){
        super("Joy ne nakh beta..........");
    }
}
class NumberGretter700 extends Exception{
    NumberGretter700(){
        super("Bhau number 7000 thi vadhi gayo chhe......");
    }
}
