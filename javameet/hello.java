public class hello{
    public static void main(String[] args) {
        meet m1 = new meet();
        m1.eat();
        m1.run();
    }
}
interface a{
    public void eat();
}
interface b{
    public void run();
}
class meet implements a,b{
    public void eat(){
        System.out.println("eat");
    }
    public void run(){
        System.out.println("run");
    }
}