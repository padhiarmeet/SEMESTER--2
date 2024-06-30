class box {
    double length;
    double height;
    double breadth;
}
class boxDemo{
    public static void main(String[] args) {
        box myBox1= new box();
        box myBox2 = new box();
        double vol;

        myBox1.length = 10;
        myBox1.height = 20;
        myBox1.breadth = 30;

        myBox2.length = 15;
        myBox2.height = 78;
        myBox2.breadth = 90;

        vol = myBox1.length*myBox1.height*myBox1.breadth;
        System.out.println(vol);
    }
}

