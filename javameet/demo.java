import java.io.FileOutputStream;

public class demo {
    public static void main(String[] args) {
        try{

            FileOutputStream fout = new FileOutputStream("Demo_text.txt");
            String s = "java file demo chhe aa";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("lol...........");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
