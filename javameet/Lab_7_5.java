interface transport{

    public void delever();
}
abstract class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal implements transport{

    public void delever(){
        System.out.println("My name is Camel");
    }
}
class Deer extends Animal{

}
class donky extends Animal implements transport{

    public void delever(){
        System.out.println("My name is Donkey.");
    }
}

public class Lab_7_5 {
    public static void main(String[] args) {
        Animal[] A = {new Camel(),new Deer(),new Tiger(),new donky()};
        for(Animal t :A){
            if(t instanceof transport){
                transport t1 = (transport) t;
                 t1.delever();   
            }
        }
    }
}
