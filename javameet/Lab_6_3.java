import java.util.*;
public class Lab_6_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        members l1=new members();
        l1.salary=111111;

        Empoly e1=new Empoly();
        Manager m1=new Manager();

        m1.name="meet";
        m1.Age=20;
        m1.phoneNumber=1234567898;
        m1.Address="darshan Univercity";
        m1.salary=123456.897;
        m1.department="marobhai";
 
        e1.name="kesal";
        e1.Age=25;
        e1.phoneNumber=1234577798;
        e1.Address="MArvadi University";
        e1.salary=23456.897;
        e1.specialization="xyz";

        e1.printE();
        m1.printm();
        l1.printsalary();
        sc.close();
    }
}
 class members{
    String name;
    int Age;
    int phoneNumber;
    String Address;
    double salary;

 void printsalary(){
    System.out.println(" ");
    System.out.println("salary of member= "+salary);
}
}
class Empoly extends members{
    String specialization;
    void printE(){
        System.out.println(" ");
        System.out.println("name= "+name);
        System.out.println("Age= "+Age);
        System.out.println("phoneNumber= "+phoneNumber);
        System.out.println("Address= "+Address);
        System.out.println("salary= "+salary); 
        System.out.println("specialization= "+specialization); 
    }
}
class Manager extends members{
    String department;
    void printm(){
        System.out.println(" ");
        System.out.println("name= "+name);
        System.out.println("Age= "+Age);
        System.out.println("phoneNumber= "+phoneNumber);
        System.out.println("Address= "+Address);
        System.out.println("salary= "+salary);  
        System.out.println("department= "+department); 
    }
}
