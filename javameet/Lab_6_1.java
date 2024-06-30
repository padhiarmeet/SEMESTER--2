import java.util.Scanner;

class Student{
    int idNo;
    int nuSubReg;
    String subCode[]= {"maths","c","Physics","DF","ES","IC"};
    int cradit[] = {6,6,5,5,2,2};
    String grades[]= {"A+","A","B+","B","C+","C"};
    int totalPoints;
    
    Double spi;

    Student(int idNo,int nuSubReg){
        

    } 

    public void calSpi(){

        for(int i=1;i<=6;i++){

            switch (grades[i]) {
                case "A+":
                    totalPoints=10*cradit[i];
                    break;
                
                case "A":
                    totalPoints=9*cradit[i];
                    break;
                case "B+":
                    totalPoints=8*cradit[i];
                    break;
                case "B":
                    totalPoints=7*cradit[i];
                    break;
                case "C+":
                    totalPoints=6*cradit[i];
                    break;
                case "C":
                    totalPoints=5*cradit[i];
                    break;
                default: 
                    totalPoints=0*cradit[i];
            }
        }
    }
}

public class Lab_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nuS = sc.nextInt();
        Student s1[] = new Student[nuS];
        for(int i =0;i<nuS;i++){
            s1[i] = new Student(111, 5);
        }
        s1[1].calSpi();
       
        System.out.println();
        sc.close();
    }
}
