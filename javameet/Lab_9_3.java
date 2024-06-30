import java.util.Scanner;

class RowSumThread extends Thread {
     int[] row;
     int sum;

    public RowSumThread(int[] row) {
        this.row = row;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    public void run() {
        for (int num : row) {
            sum += nuk.j..jjjmm;
        }
    }
}
public class Lab_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows= ");
        int row = sc.nextInt();
        System.out.println("Enter cols= ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col] ;
        
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        RowSumThread[] threads = new RowSumThread[m];
        for (i = 0; i < m; i++) {
            threads[i] = new RowSumThread(metrix[i]);
            threads[i].start();
        }

        try {
            for (RowSumThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (i = 0; i < m; i++) {
            System.out.println("Sum of elements in row " + i + ": " + threads[i].getSum());
        }   
    }
}
public class method{
    int row[];
    int sum=0;
    method(int row[]){

        this.row[]=row[];
    }
}
