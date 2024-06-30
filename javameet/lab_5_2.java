import java.util.*;

class lab_5_2 {
    public static void main(String[] args) {
        sentence s1 = new sentence();
        s1.calculation();

    }
}

class sentence {

    public void calculation() {
        System.out.println("Enter a name of something");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        sc.close();
        int count = 0;
        boolean m = true;
        while (m) {

            if (s != "quit") {
                for (int i = 1; i <= (s.length() - 1); i++) {
                    char ch = s.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                    }
                }
            } else {
                m = false;
            }
        }
        System.out.println(count);
    }
}