interface EventListener{

    public void performevent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void  mousePressed();
    public void  mouseReleased();
    public void  mouseMoved();
    public void mouseDragged();
}
interface KeyListner extends EventListener{
    public void keyPressed();
    public void  keyReleased();
}
class EventDemo implements MouseListener,KeyListner{

    public void mouseClicked(){
        System.out.println("Mouse nu click thyu maro bhai");
    }
    public void mousePressed(){
        System.out.println("Mouse nu Press thyu maro bhai");
    }
    public void mouseReleased(){
        System.out.println("Mouse ne kaike relate thyu maro bhai");
    }
    public void mouseMoved(){
        System.out.println("Mouse Move thyu maro bhai");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragg thyu maro bhai");
    }
    public void keyPressed(){
        System.out.println("Key Press thai maro bhai");
    }
    public void keyReleased(){
        System.out.println("Key Relese thai maro bhai");
    }
    public void performevent(){
        System.out.println("Event perform thyu maro bhai");
    }
}


public class Lab_7_4 {
   public static void main(String[] args) {
    EventDemo ed = new EventDemo();
    ed.mouseClicked();
    ed.mousePressed();
    ed.mouseDragged();
    ed.mouseMoved();
    ed.mouseReleased();
    ed.keyPressed();
    ed.keyReleased();
    ed.performevent();
   }

}
