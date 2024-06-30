class Morning implements Runnable{

    public void run(){

        try{
            
            while(true){
                System.out.println("Good Morning bro");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    } 
}
class Aftrenoon implements Runnable{

    public void run(){

        try{
            
            while(true){
                System.out.println("Good Afternoon bro");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
public class Lab_9_1 {
    public static void main(String[] args) {
        
        Runnable R1 = new Morning();
        Runnable R2 = new Aftrenoon();

        Thread t1 = new Thread(R1);
        Thread t2 = new Thread(R2);
        t1.start();
        t2.start();
    }
}
class method extends Thread{
    int sum = 0;
    int row[];

    public matrix(int row[]){
        this.row[] = row[];
        this.sum = sum;
    }
}
