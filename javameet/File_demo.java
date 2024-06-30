import java.io.*;

public class File_demo {
    public static void main(String[] args) {
        try{

            FileOutputStream fout = new FileOutputStream("Demo_text.txt");
            String s = "MeetChheAA";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("lol...........");
            
                FileInputStream fin = new FileInputStream("Demo_text.txt");
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);
                }
                fin.close();
        }catch(Exception e){
            e.printStackTrace();
        }

       
    }
}

