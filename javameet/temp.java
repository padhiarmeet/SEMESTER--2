interface Bicycle{
    int a= 45;
    void appyBrake(int decrement);
    void speedUp(int increment);
}
interface MariBicycle{
    int b= 12;
    void appyMariBrake(int decrement);
    void MarispeedUp(int increment);
}

class AvonCycle implements Bicycle, MariBicycle{
    void blownHorn(){
        System.out.println("hello how are khana khake jana");
    }
    public void appyBrake(int decrement){
        System.out.println("applying breaks....");
    }
    public void speedUp(int increment){
        System.out.println("bhuuurrrrrrrrr");
    }
    public void appyMariBrake(int decrement){
        System.out.println("Mari break mari chhe me");
    }
    public void MarispeedUp(int increment){
        System.out.println("me mari speedup kari cheh tane kai chhe vandho to ke mane");
    }
}
public class temp {
    public static void main(String[] args) {
        AvonCycle Meet = new AvonCycle();
        Meet.appyBrake(1);
        System.out.println(Meet.a);
        Meet.MarispeedUp(5);
        System.out.println(Meet.b);
        
    }
}
