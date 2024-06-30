import java.io.BufferedReader;
import java.io.FileReader;

public class Bufferdreader {
    public static void main(String[] args) {
        int count = 0;
        try{
           BufferedReader br = new BufferedReader(new FileReader("Lab_10_1_text.txt"));
            String data = "";
            while((data = br.readLine()) != null){
                count++;
            }
            System.out.println(count);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
