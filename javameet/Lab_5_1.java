import java.util.Scanner;

public class Lab_5_1 {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Cricle s = new Cricle();
        System.out.println("Area of Circle = "+s.area(a));
        sc.close();
    }
}
class Cricle{

    public double area(int r){
        double a = (Math.PI)*r*r;
        return a;
    }
}
