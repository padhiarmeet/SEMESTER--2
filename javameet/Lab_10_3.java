import java.io.FileReader;
import java.util.Scanner;

public class Lab_10_3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your file name = ");
        String s = sc.nextLine(); 
        try{

            FileReader fr = new FileReader(s);
            int charRead;

            while((charRead = fr.read()) != -1){
                charRead = fr.read();
                if(charRead ==(char)5){
                    count++;
                }
            }
            System.out.println("Number of 5 = "+count);
            fr.close();
            sc.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
