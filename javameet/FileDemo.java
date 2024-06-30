import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File F1 = new File("Demo.java");
        System.out.println(F1.getName());
        // System.out.println(F1.getPath());
        // System.out.println(F1.getAbsolutePath());
        // System.out.println(F1.getParent());
         System.out.println(F1.exists());
    }
}
