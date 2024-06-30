 class Add {

    public int sum(int ...arr){
        
        int summ=0;
       for(int a:arr){
            summ += a;
       }
       return summ;
    }
}
public class method {

    public static void main(String[] args) {
      Add a1 = new Add();
     int ans= a1.sum(1,2,3,4);
        System.out.println("total of your number="+ans);

    }

}
  