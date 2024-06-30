import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab_11_4 {
    public static void main(String[] args) {
       try{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Lab_11_4_text.txt"));
        dos.writeUTF("meet");
        dos.writeInt(18);
        dos.writeUTF("meet");
        dos.writeInt(18);
        dos.writeUTF("meet");
        dos.writeInt(18);
        DataInputStream dis = new DataInputStream(new FileInputStream("Lab_11_4_text.txt"));
        while(dis.available()>0){
            String name = dis.readUTF();
            int age = dis.readInt();
            Student stu = new Student(name, age);
            System.out.println(stu.printinfo());
        }
        dos.close();
        dis.close();
       }
       catch(Exception e){
        e.printStackTrace();
       }
    }
}
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String printinfo(){
        return "age = "+age+",name= "+name;
    }
}
