import java.util.Scanner;
import java.io.*;

public class Lab_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{

            String name = "";
            System.out.println("Enter your file name or directory name = ");
            name = sc.nextLine();
            File f1 = new File(name);

            if(f1.exists()==true){
                System.out.println("File size ="+f1.length());
            }
            else if(name == f1.getAbsolutePath()){
               System.out.println(f1.list());
            }
            else{
                
            }
            sc.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
