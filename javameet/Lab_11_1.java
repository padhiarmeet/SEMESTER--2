import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab_11_1 {
    public static void main(String[] args) {
        try{
           BufferedWriter bw = new BufferedWriter(new FileWriter("Lab_11_1_text.txt"));
           bw.write("Meet 280\n");

           bw.write("Vandan 281\n");

           bw.close();
           BufferedReader br = new BufferedReader(new FileReader("Lab_11_1_text.txt"));
            String temp = "";
           
           while((temp = br.readLine()) != null){
            String[] s = temp.split("\\s+");
            String tName = s[0];
            int tMark = Integer.parseInt(s[1]);
            Student stu = new Student(tName,tMark);
            System.out.println(stu.printinfo());
           }
           br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
class Student{
    String name;
    int mark;
    Student(String name,int mark){
        this.name = name;
        this.mark = mark;
    }
    public String printinfo(){
        return "mark= "+mark+",name= "+name;
    }
}
