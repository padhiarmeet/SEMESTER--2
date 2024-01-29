import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.awt.image.BufferedImage;

public class Window extends JFrame {

    public BufferedImage image;

    public Window() {
        int i, j, k;

        setTitle("Cube Animation");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a BufferedImage with TYPE_INT_ARGB
        image = new BufferedImage(1000, 600, BufferedImage.TYPE_INT_ARGB);

        k =  (255 << 24) | (100 << 16) | (100 << 8) | 100;
        for(i = 0;i < 1000;i++){
            for(j = 0;j < 600;j++){
                image.setRGB(i, j, k);
            }
        }

    }

    // private void setPixel(int x, int y, int rgb) {
    //     // Set the RGB value of the pixel
    //     image.setRGB(x, y, rgb);
    // }

    @Override
    public void paint(Graphics g) {
        // Draw the BufferedImage on the JFrame
        g.drawImage(image, 0, 0, this);
    }

    public void PrintPixel(AllVariable V) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 600; j++) {
                if (V.Pixel[i][j][0] != V.Pixel[i][j][1]) {
                    image.setRGB(i, j,  V.Pixel[i][j][1]);
                    V.Pixel[i][j][0] = V.Pixel[i][j][1];
                }
            }
        }
        // Repaint the JFrame to reflect the changes
        repaint();
    }

    public void PrintCube(AllVariable V) {
        int[] Point = new int[3];
        V.Set_All_Direction();
        V.Set_Screen_C();
        for (Point[0] = -120; Point[0] <= 120; Point[0]++) {
            for (Point[1] = -120; Point[1] <= 120; Point[1]++) {
                for (Point[2] = -120; Point[2] <= 120; Point[2]++) {
                    if( ( Point[0] == -120 || Point[0] == 120 ) 
                    ||  ( Point[1] == -120 || Point[1] == 120 ) 
                    ||  ( Point[2] == -120 || Point[2] == 120 )
                    ){
                        if(((Point[0] == -120 || Point[0] == 120) && (Point[1] == -120 || Point[1] == 120))
                        || ((Point[1] == -120 || Point[1] == 120) && (Point[2] == -120 || Point[2] == 120))
                        || ((Point[2] == -120 || Point[2] == 120) && (Point[0] == -120 || Point[0] == 120)))  
                        V._2D_Point(Point, V.rgb(0,0,0));
                        // else V._2D_Point(Point, V.rgb(0,255,0));
                        else{
                            if(Point[2] == -120) V._2D_Point(Point, V.rgb(255,255,255));
                            else if(Point[2] == 120) V._2D_Point(Point, V.rgb(255,255,0));
                            else if(Point[1] == -120) V._2D_Point(Point, V.rgb(255,0,0));
                            else if(Point[1] == 120) V._2D_Point(Point, V.rgb(255,100,0));
                            else if(Point[0] == -120) V._2D_Point(Point, V.rgb(0,255,0));
                            else if(Point[0] == 120) V._2D_Point(Point, V.rgb(0,0,255));
                            if((Point[2]+41)%80 == 0 ||(Point[1]+41)%80 == 0 || (Point[0]+41)%80 == 0) V._2D_Point(Point, V.rgb(0,0,0));
                            
                        }                    
                    }
                }
            }
        }
        PrintPixel(V);
    }

    public static void main(String[] args) {
        Window window = new Window();
        SwingUtilities.invokeLater(() -> {
            window.setVisible(true);
        });
        
        AllVariable V = new AllVariable();
        V.Set_All_Variable(1);
        V.Set_Camera(0, 0, -550, 500);

        // window.Print(V);
        // window.repaint();

        double angle1 = 0;
        double angle2 = 0;
        int r;

        while(true){
           
            
            V.Camera[0] = 0;
            V.Camera[1] = ( ( 0 * Math.cos(angle2) ) + ( -800 * Math.sin(angle2) ) );
            V.Camera[2] = ( ( -800 * Math.cos(angle2) ) - ( 0 * Math.sin(angle2) ) );

            V.Camera[0] = ( ( 0 * Math.cos(angle1) ) + ( V.Camera[2] * Math.sin(angle1) ) );
            V.Camera[2] = ( ( V.Camera[2] * Math.cos(angle1) ) - ( 0 * Math.sin(angle1) ) );
            
            window.PrintCube(V);

            r = (int)( Math.floor( 100 * Math.random() ) );

            if( r%3==0 ){
                angle2+=0.02;
                V.Angle[0]+=0.02;
            }
            else if( r%3 == 1){
                angle1+=0.02;
                V.Angle[1]-=0.02;
            }
            else{
                angle2+=0.01;
                V.Angle[0]+=0.01;
                angle1+=0.01;
                V.Angle[1]-=0.01;
            }

        }
    }

}
