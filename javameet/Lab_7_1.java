
public class Lab_7_1 {

    public static void main(String[] args) {
        potato p1 = new potato("broun");
        Tomato t1 = new Tomato("red");
        bringle b1 = new bringle("purple"); 
        System.out.println(p1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
    }

}

abstract class Vagitables {

    String color;

    public abstract String toString();

    Vagitables(String color) {
        this.color = color;
    }
}

class potato extends Vagitables {

    String name = "potato";

    potato(String color) {
        super(color);
    }
    public String toString(){
        return name+" "+color;
    }

}

class bringle extends Vagitables {
    String name = "bringle";

        bringle(String color){
            super(color);
        }
        public String toString(){
            return name+ ""+color;
        }

}

class Tomato extends Vagitables{
    String name = "tomato";

    Tomato(String color){
        super(color);
    }
    public String toString(){
        return name+ ""+color;
    }

    }
