import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        Book b1 = new Book_pub("Alkemist","pablo KOelo");
        Book b2 = new Paper_pub("sara Chhe","hetb");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp==1){
            b1.displayPublication();
        }
        else{
            b2.displayPublication();
        }
        sc.close();
    }
}
class Book{

    private String authorName;

    Book(String authorName){
        this.authorName = authorName;
    }
    public void displayPublication(){
        System.out.println("Authorname = "+authorName);
    }
}

class Book_pub extends Book{

    private String title;

    Book_pub(String title,String authorName){
        super(authorName);
        this.title = title;
        }
    
    public void displayPublication(){
        super.displayPublication();
        System.out.println("Tittle name = "+title);
    }
}


class Paper_pub extends Book{
    private String title;

    Paper_pub(String title,String author){
        super(author);
        this.title = title;
    }
    public void displayPublication(){
        super.displayPublication();
        System.out.println("Tittle name = "+title);
    }
}

