class ObjectCounter {

    static int count = 0;
  
    public ObjectCounter() {
      count++;
    }

    public static int getCount() {
      return count;
    }
  }
  
  public class Lab_5_6 {
    public static void main(String[] args) {

      ObjectCounter obj1 = new ObjectCounter();
      ObjectCounter obj2 = new ObjectCounter();
      ObjectCounter obj3 = new ObjectCounter();
  
      System.out.println("The number of objects = " + ObjectCounter.getCount());
    
    }
}
  