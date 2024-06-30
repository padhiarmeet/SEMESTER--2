import java.io.*;

public class Lab_10_4 {
    public static void main(String[] args) {
        try{
           FileOutputStream fr = new FileOutputStream("Lab_11_1_text.txt");
          String s1 = "mann padhair,120 meet,121";
          byte[] b = s1.getBytes(); 
          fr.write(b);

          FileInputStream fw = new FileInputStream("Lab_11_1_text.txt");
          
          String temp = "";
          int charRead;
          while((charRead = fw.read()) <= -1){
              String[] s = temp.split("\\s+");
              String tName = s[0];
              int tMark = Integer.parseInt(s[1]);
              Student stu = new Student(tName,tMark);
              System.out.println(stu.printinfo());
            }
            fr.close();
            fw.close();
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
