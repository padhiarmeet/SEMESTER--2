import java.util.Scanner;

public class Bank{

            public static void main(String[] args) {
                Bank_Account b = new Bank_Account(1,"meet",0.00,"meetvalochhe","ioio");
                b.getAccountDetails();
                b.printAccDetails();
                
            }

    }
    class Bank_Account{
        int Account_no;
        String userName;
        double AccBlance;
        String Email;
        String accType;

        public Bank_Account(int Account_no,String userName,double AccBlance,String Email,String accType){
            this.Account_no = Account_no;
            this.userName = userName;
            this.AccBlance = AccBlance;
            this.Email = Email;
            this.accType = accType;

        }
        public void getAccountDetails(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Account number= ");
            Account_no=sc.nextInt();
            System.out.println("Enter username type= ");
            userName=sc.nextLine();
            System.out.println("Enter Your Email= ");
            Email=sc.nextLine();
            System.out.println("Enter Account balance= ");
            AccBlance=sc.nextDouble();
            System.out.println("Enter Account type= ");
            accType=sc.nextLine();  
            sc.close();
        }
        public void printAccDetails(){
            System.out.println(AccBlance);
            System.out.println(userName);
            System.out.println(Email);
            System.out.println(AccBlance);
            System.out.println(accType);

        }
    }

