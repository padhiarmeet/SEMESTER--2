public class pettarn{
    
    public static void main(String args[]){

        int i;
        int j;
        int k;

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
               System.out.print(" *");
               if(i==5 && j==5){

                for(i=5;i<=10;i++){
            for(j=5;j<=i;j++){
               System.out.print(" *");
            }
        }


               }
            }
            System.out.print("\n");
        }

        for(i=1;i<=5;i++){
            for(k=5-i;k>=1;k--){
                    System.out.print(" *");
            }
            for(j=1;j<=i;j++){
               System.out.print(" ");
            }
            System.out.print("\n");
        }
        
           
    }
    }
    
