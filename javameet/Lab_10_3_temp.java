import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Lab_10_3_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        s = sc.nextLine();
        int count = 0;

        try{

            BufferedReader br = new BufferedReader(new FileReader(s));
            String temp = "";
            while((temp = br.readLine()) != null){

                String[] number = temp.split("\\s+");

                for(int i=0;i<number.length;i++){
                    if(number[i].length() == 5){
    
                        count++;
                    }
            }
            System.out.println("Number with more then 5 word is "+count);
            br.close();
            sc.close();
        }

        }catch(Exception e){
            System.out.println("Bhai Tamare Exception Ave chhe....");
        }
    }
}

