public class Lab_6_5{

    double x;
    double y;
    double z;

    public Lab_6_5(){
        x=0;
        y=0;
        z=0;
    }
    public Lab_6_5(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double distance(Lab_6_5 temp){
        double dx = this.x-temp.x;
        double dy = this.y-temp.y;
        double dz = this.z-temp.z;
        return Math.sqrt((dx*dx)+(dy*dy)+(dz*dz));
    }
    public double Distance(double x,double y,double z){
        double dx = this.x-x;
        double dy = this.y-y;
        double dz = this.z-z;
        return Math.sqrt((dx*dx)+(dy*dy)+(dz*dz));
    }
    public static void main(String[] args) {
        Lab_6_5 n1 = new Lab_6_5(100,3,4);
        Lab_6_5 n2 = new Lab_6_5(40,30,10);
        System.out.println(n1.distance(n2));
        System.out.println(n2.Distance(10, 1, 1));
    }
}