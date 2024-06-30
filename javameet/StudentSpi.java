


public class StudentSpi {
    public static void main(String[] args) {
        student s1 = new student();
        s1.calculate_spi();
    }
}

class student {
    String id_no;
    int no_of_subject;
    String subject_name[] = { "MATHS", "C", "PHYSICS", "DF", "IC", "ES" };
    int subject_credits[] = { 6, 6, 5, 5, 2, 2 };
    String gread_obtain[] = { "A+", "A", "A+", "B+", "C", "B" };
    double spi;

    void calculate_spi() {
        int totalcredit = 0;
        for (int i = 0; i < 6; i++) {
            switch (gread_obtain[i]) {
                case ("A+"): {
                    totalcredit += 10 * subject_credits[i];
                    break;
                }
                case ("A"): {
                    totalcredit += 9 * subject_credits[i];
                    break;
                }
                case ("B+"): {
                    totalcredit += 8 * subject_credits[i];
                    break;
                }
                case ("B"): {
                    totalcredit += 7 * subject_credits[i];
                    break;
                }
                case ("C+"): {
                    totalcredit += 6 * subject_credits[i];
                    break;
                }
                case ("C"): {
                    totalcredit += 5 * subject_credits[i];
                    break;
                }
            }

        }
        double totalspi = totalcredit / 26;
        System.out.println(totalspi);
    }

}
