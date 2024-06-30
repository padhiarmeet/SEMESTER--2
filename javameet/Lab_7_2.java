interface A{
    int a =20;
    public void display();
}
interface A1 extends A{
    int b = 30;
    public void display1();
}
interface A2 extends A{
    int c= 40;
    public void display2();
}
///////////////////////////////////////////////////////////////
interface A12 extends A1,A2{
    int d= 50;
    public void display3();
}
class B implements A12{
    public void display(){
        System.out.println(a);
    }
    public void display1(){
        System.out.println(b);
    }
    public void display2(){
        System.out.println(c);
    }
    public void display3(){
        System.out.println(d);
    }
}

public class Lab_7_2 {
    
   public static void main(String[] args) {
    B b1 = new B();
    b1.display();
    b1.display1();
    b1.display2();
    b1.display3();
   }
}
