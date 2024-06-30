public class Lab_6_4 {
    double x;
    double y;
    public Lab_6_4(){
        x=0;
        y=0;
    }
    public Lab_6_4(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double Distance(Lab_6_4 temp){
        double dx = this.x-temp.x;
        double dy = this.y-temp.y;
        return Math.sqrt((dx*dx)+(dy*dy));
    }
    public double Distance(double x,double y){
        double dx = this.x-x;
        double dy = this.y-y;
        return Math.sqrt((dx*dx)+(dy*dy));
    }
    public static void main(String[] args) {
        Lab_6_4 m1 = new Lab_6_4(40,20);
        Lab_6_4 m2 = new Lab_6_4(80,40);
       
        System.out.println(m2.Distance(1, 0));
        System.out.println(m1.Distance(m2));
    }
}
