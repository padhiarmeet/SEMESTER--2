import java.util.Scanner;

class Try{
    public static void main(String[] args) {
        System.out.println("Enter number which you want to add = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 0;

        for(int i=0;i<number;i++){
            System.out.println("Enter number which you want to add = ");
            int count  = sc.nextInt();
            total += count;
        }
        System.out.println("Your total number = " + total);
    }
}