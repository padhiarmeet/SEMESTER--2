//to count the number of words , sentences, charecters.
import java.io.*;
public class Lab_10_1 {
    public static void main(String[] args) {
        try{


            File f1 = File("Lab_10_1_text.txt");
            int countCharecter = 0;
            int countSentence = 0;
            int countWord = 0;
                
            BufferedReader br = new BufferedReader(new FileReader("Lab_10_1_text.txt"));
            String data = "";

                while((data = br.readLine()) != null){
                    String[] s = data.split("\\s+");
                    countWord+=s.length;
                    System.out.println(s);
                    
                    countSentence++;
                   
                }
                countCharecter += f1.length();
                countCharecter += br.length();
                System.out.println("Number of Cherecters = "+countCharecter);
                System.out.println("Number of sentence = "+countSentence);
                System.out.println("Number of Words = "+countWord);
                br.close();
                fis.close();
        }
        catch(Exception e){
           System.out.println("File is not Readble chhe.....");
        }
        


    }
}
