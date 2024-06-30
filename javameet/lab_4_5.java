import java.util.Scanner;

class Bank_account{
    int accNumber;
    String userName;
    String Email;
    String accType;
    Double accBalence;

    public void getAccDetails(){

        Scanner sc= new Scanner(System.in);

        System.out.println("Username= ");
        userName= sc.nextLine();
        // sc.nextLine();
        System.out.println("Account number= ");
        accNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Account balance= ");
        accBalence =sc.nextDouble();
        sc.nextLine();
       
        System.out.println("Email= ");
        Email = sc.nextLine();
       

        System.out.println("Account type= ");
        accType= sc.nextLine();
        System.out.println(" ");

      
        sc.close();
    }

    public void PrintAccDetails(){

        System.out.println(accNumber);
        System.out.println(userName);
        System.out.println(Email);
        System.out.println(accType);
        System.out.println(accBalence);
    }
}

public class lab_4_5 {
    public static void main(String[] args) {
        
        Bank_account b = new Bank_account();
        b.getAccDetails();
        b.PrintAccDetails();
        
    }
   
}
