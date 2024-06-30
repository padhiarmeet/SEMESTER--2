public class Temo {
    public static void main(String[] args) {
        String s = "Hello World";
        String []name = s.split("\\s+");
        String t = name[name.length-1];
        System.out.println(t); 
    }
}
