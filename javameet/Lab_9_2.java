import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab_9_2 {
    public static void main(String[] args) {
        
        Runnable R1 = new Odd();
        Runnable R2 = new Even();
        Thread t1 = new Thread(R1);
        Thread t2 = new Thread(R2);
        t1.start();
        t2.start();

        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(R1);
    }
}
class Odd implements Runnable{
    public static final String ANSI_YELLOW = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m"; 
    public void run(){
        try{
            for(int i=1;i<=20;i++){
                if(i%2!=0){
                    System.out.println(ANSI_YELLOW+i+ ANSI_RESET);
                    Thread.sleep(1000);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Even implements Runnable{
    public static final String ANSI_YELLOW = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public void run(){

        try{
            for(int i=1;i<=20;i++){
                if(i%2==0){
                   
                    System.out.println(ANSI_YELLOW+i+ ANSI_RESET); 
                    Thread.sleep(1000);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
