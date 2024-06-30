//Introduction to exception and costom exception................

public class Lab_8_1 {
    public static void main(String[] args){
      
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int temp=1;
            if(y<0){
                // throw new NumberNotZero("Y zero thi nano the jo to khara...");
                throw new NumberNotZero();
            }
            else{
            if(x==0 && y ==0){
                throw new Exception("Bhai bey Zero na hoi......");
            }
            else{
                for(int i=1;i<=y;i++){
                    temp = temp*x;
                }
                System.out.println(temp);
            }
        }
    }
        catch(IllegalArgumentException e){
            System.out.println("Number nakh bhai..");
        }
        catch(ArithmeticException e){
            System.out.println("Erithmetic thyu");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Joy ne to nakho bhai...");
        }
        catch(Exception e){
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
class NumberNotZero extends Exception{

    NumberNotZero(){
        
        // super(error);
        super("Y zero thi nano the jo to khara...");
    }
}


