import java.util.Arrays;
import java.lang.Math;

public class AllVariable{
    public int i, j;
    private int DBSC;
    private double[] XD = new double[3];
    private double[] YD = new double[3];
    private double[] ZD = new double[3];
    private double[] Point_S_3D = new double[3];
    private double[] Point_S_2D = new double[2];
    private double Lambda;
    private double[] Extra = new double[3];
    private double[] Point = new double[3];
    private int[] Dimension = {1000, 600};
    
    public int [][][] Pixel = new int[1001][601][3];
    public double[] Angle = new double[3];
    public double[] Screen_C = new double[3];
    public double[] X_Direction = new double[3];
    public double[] Y_Direction = new double[3];
    public double[] Z_Direction = new double[3];
    public double[] Camera = new double[4];
    public double angleCos;
    public double mag;

    public void Set_All_Variable(int a) {
        int color = rgb(100,100,100);
        if (a != 0) {
            Arrays.fill(Angle, 0);
            for (int i = 0; i < 1000; i++) {
                for (int j = 0; j < 600; j++) {
                    Pixel[i][j][0] = color;
                    Pixel[i][j][1] = color;
                    Pixel[i][j][2] = 600;
                }
            }
            double d = (Math.sqrt(Math.pow(Dimension[0], 2) + Math.pow(Dimension[1], 2))) / 2.0;
            angleCos = (double) DBSC / (Math.sqrt(Math.pow(d, 2) + Math.pow(DBSC, 2)));
        } else {
            for (int i = 0; i < 1000; i++) {
                for (int j = 0; j < 600; j++) {
                    Pixel[i][j][1] = color;
                    Pixel[i][j][2] = 600;
                }
            }
        }
        XD[0] = 50;
        XD[1] = 0;
        XD[2] = 0;
        YD[0] = 0;
        YD[1] = 50;
        YD[2] = 0;
        ZD[0] = 0;
        ZD[1] = 0;
        ZD[2] = 50;
    }

    public void Set_All_Direction() {
        Set_All_Variable(0);
        Rotate_From_X();
        Rotate_From_Y();
        Rotate_From_Z();
    }

    public void Rotate_From_X() {
        X_Direction[0] = XD[0];
        X_Direction[1] = (XD[1] * Math.cos(Angle[0])) + (XD[2] * Math.sin(Angle[0]));
        X_Direction[2] = (XD[2] * Math.cos(Angle[0])) - (XD[1] * Math.sin(Angle[0]));

        Y_Direction[0] = YD[0];
        Y_Direction[1] = (YD[1] * Math.cos(Angle[0])) + (YD[2] * Math.sin(Angle[0]));
        Y_Direction[2] = (YD[2] * Math.cos(Angle[0])) - (YD[1] * Math.sin(Angle[0]));

        Z_Direction[0] = ZD[0];
        Z_Direction[1] = (ZD[1] * Math.cos(Angle[0])) + (ZD[2] * Math.sin(Angle[0]));
        Z_Direction[2] = (ZD[2] * Math.cos(Angle[0])) - (ZD[1] * Math.sin(Angle[0]));

        System.arraycopy(X_Direction, 0, XD, 0, 3);
        System.arraycopy(Y_Direction, 0, YD, 0, 3);
        System.arraycopy(Z_Direction, 0, ZD, 0, 3);
    }

    public void Rotate_From_Y() {
        X_Direction[0] = (XD[0] * Math.cos(Angle[1])) - (XD[2] * Math.sin(Angle[1]));
        X_Direction[1] = XD[1];
        X_Direction[2] = (XD[0] * Math.sin(Angle[1])) + (XD[2] * Math.cos(Angle[1]));

        Y_Direction[0] = (YD[0] * Math.cos(Angle[1])) - (YD[2] * Math.sin(Angle[1]));
        Y_Direction[1] = YD[1];
        Y_Direction[2] = (YD[0] * Math.sin(Angle[1])) + (YD[2] * Math.cos(Angle[1]));

        Z_Direction[0] = (ZD[0] * Math.cos(Angle[1])) - (ZD[2] * Math.sin(Angle[1]));
        Z_Direction[1] = ZD[1];
        Z_Direction[2] = (ZD[0] * Math.sin(Angle[1])) + (ZD[2] * Math.cos(Angle[1]));

        System.arraycopy(X_Direction, 0, XD, 0, 3);
        System.arraycopy(Y_Direction, 0, YD, 0, 3);
        System.arraycopy(Z_Direction, 0, ZD, 0, 3);
    }

    public void Rotate_From_Z() {
        X_Direction[0] = (XD[0] * Math.cos(Angle[2])) + (XD[1] * Math.sin(Angle[2]));
        X_Direction[1] = (XD[1] * Math.cos(Angle[2])) - (XD[0] * Math.sin(Angle[2]));
        X_Direction[2] = XD[2];

        Y_Direction[0] = (YD[0] * Math.cos(Angle[2])) + (YD[1] * Math.sin(Angle[2]));
        Y_Direction[1] = (YD[1] * Math.cos(Angle[2])) - (YD[0] * Math.sin(Angle[2]));
        Y_Direction[2] = YD[2];

        Z_Direction[0] = (ZD[0] * Math.cos(Angle[2])) + (ZD[1] * Math.sin(Angle[2]));
        Z_Direction[1] = (ZD[1] * Math.cos(Angle[2])) - (ZD[0] * Math.sin(Angle[2]));
        Z_Direction[2] = ZD[2];

        System.arraycopy(X_Direction, 0, XD, 0, 3);
        System.arraycopy(Y_Direction, 0, YD, 0, 3);
        System.arraycopy(Z_Direction, 0, ZD, 0, 3);
    }

    public double Dot_Product(double[] A, double[] B) {
        return (A[0] * B[0]) + (A[1] * B[1]) + (A[2] * B[2]);
    }

    public int Distance(double[] A, double[] B) {
        return RoundOff(Math.sqrt(Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2) + Math.pow(A[2] - B[2], 2)));
    }

    public int RoundOff(double Num) {
        if (((int) (Num * 10)) % 10 <= 5) {
            return (int) Num;
        }
        return (int) Num + 1;
    }

    public void _2D_Point(int[] P, int a) {
        for (i = 0; i < 3; i++) {
            Point[i] = P[i];
        }
        XY A = new XY();
        if (PointOnScreen() != 0) {
            return;
        }
        A.Point[0] = (Dimension[0] / 2) + (int)(Point_S_2D[0]);
        A.Point[1] = (Dimension[1] / 2) - (int)(Point_S_2D[1]);
        if (A.Point[0] > Dimension[0] || A.Point[0] < 0 || A.Point[1] > Dimension[1] || A.Point[1] < 0) {
            return;
        }
        Set_Point_in_Screen(A, a);
    }

    public int PointOnScreen() {
        for (i = 0; i < 3; i++) {
            Extra[i] = Point[i] - Camera[i];
        }
        if ((Dot_Product(Z_Direction, Extra) / (mag * Math.sqrt(Dot_Product(Extra, Extra)))) < angleCos) {
            return 1;
        }
        Lambda = (Dot_Product(Z_Direction, Screen_C) - Dot_Product(Z_Direction, Point)) / Dot_Product(Z_Direction, Extra);
        for (i = 0; i < 3; i++) {
            Point_S_3D[i] = Point[i] + (Lambda * (Point[i] - Camera[i]));
        }
        for (i = 0; i < 3; i++) {
            Extra[i] = Point_S_3D[i] - Screen_C[i];
        }
        Point_S_2D[0] = RoundOff(Dot_Product(Extra, X_Direction) / Math.sqrt(Dot_Product(X_Direction, X_Direction)));
        Point_S_2D[1] = RoundOff(Dot_Product(Extra, Y_Direction) / Math.sqrt(Dot_Product(Y_Direction, Y_Direction)));
        return 0;
    }

    public void Set_Point_in_Screen(XY SP, int a) {
        int Dis = Distance(Point, Screen_C);
        if (Dis <= Pixel[SP.Point[0]][SP.Point[1]][2] || ( (a == 0) && (Dis - 5) <= Pixel[SP.Point[0]][SP.Point[1]][2])) {
            if (a != 0) {
                Pixel[SP.Point[0]][SP.Point[1]][2] = Dis;
            } else {
                Pixel[SP.Point[0]][SP.Point[1]][2] = Dis - 5;
            }
            Pixel[SP.Point[0]][SP.Point[1]][1] = a;
        }
    }

    public void Set_Screen_C() {
        Lambda = DBSC / Math.sqrt(Dot_Product(Z_Direction, Z_Direction));
        for (i = 0; i < 3; i++) {
            Screen_C[i] = Camera[i] + (Lambda * Z_Direction[i]);
        }
    }

    public void Set_Camera(int a, int b, int c, int D) {
        Camera[0] = a;
        Camera[1] = b;
        Camera[2] = c;
        DBSC = D;
    }

    public void Move_Forward_Backward(int a) {
        Lambda = a / Math.sqrt(Dot_Product(Z_Direction, Z_Direction));
        for (i = 0; i < 3; i++) {
            Camera[i] = Camera[i] + (Lambda * Z_Direction[i]);
        }
        Set_Screen_C();
    }

    public void Move_Right_Left(int a) {
        Lambda = a / Math.sqrt(Dot_Product(X_Direction, X_Direction));
        for (i = 0; i < 3; i++) {
            Camera[i] = Camera[i] + (Lambda * X_Direction[i]);
        }
        Set_Screen_C();
    }

    public void Move_Up_Down(int a) {
        Lambda = a / Math.sqrt(Dot_Product(Y_Direction, Y_Direction));
        for (i = 0; i < 3; i++) {
            Camera[i] = Camera[i] + (Lambda * Y_Direction[i]);
        }
        Set_Screen_C();
    }

    public int rgb(int r, int g, int b){
        return (255 << 24) | (r << 16) | (g << 8) | b;
    }

}