public class Student {
    // Data members
    private int idNo;
    private int noOfSubjectsRegistered;
    private String[] subjectCode;
    private int[] subjectCredits;
    private char[] gradeObtained;
    private double spi;

    // Constructor
    public Student(int idNo, int noOfSubjectsRegistered, String[] subjectCode,
                   int[] subjectCredits, char[] gradeObtained) {
        this.idNo = idNo;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
        calculateSPI();
    }

    // Method to calculate SPI
    private void calculateSPI() {
        double totalCredits = 0;
        double weightedSum = 0;

        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            int credits = subjectCredits[i];
            char grade = gradeObtained[i];

            // Assign weights to grades (you can customize this based on your grading system)
            double gradeWeight;
            switch (grade) {
                case 'A':
                    gradeWeight = 10;
                    break;
                case 'B':
                    gradeWeight = 8;
                    break;
                case 'C':
                    gradeWeight = 6;
                    break;
                default:
                    gradeWeight = 0; // Assuming F or other grades have no weight
            }

            totalCredits += credits;
            weightedSum += credits * gradeWeight;
        }

        if (totalCredits > 0) {
            spi = weightedSum / totalCredits;
        } else {
            spi = 0; // Handle division by zero (no registered subjects)
        }
    }

    // Getter for SPI
    public double getSpi() {
        return spi;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Assuming command line arguments are provided in the format:
        // idNo noOfSubjectsRegistered subjectCode1 subjectCredits1 grade1 ...
        // Example: 101 3 MATH101 4 A PHY102 3 B CHEM103 3 C

        int n = (args.length - 2) / 3; // Number of students
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int idNo = Integer.parseInt(args[i * 3]);
            int noOfSubjects = Integer.parseInt(args[i * 3 + 1]);
            String[] subjectCodes = new String[noOfSubjects];
            int[] subjectCredits = new int[noOfSubjects];
            char[] grades = new char[noOfSubjects];

            for (int j = 0; j < noOfSubjects; j++) {
                subjectCodes[j] = args[i * 3 + 2 + j * 2];
                subjectCredits[j] = Integer.parseInt(args[i * 3 + 3 + j * 2]);
                grades[j] = args[i * 3 + 4 + j * 2].charAt(0);
            }

            students[i] = new Student(idNo, noOfSubjects, subjectCodes, subjectCredits, grades);
            System.out.println("Student " + idNo + " SPI: " + students[i].getSpi());
        }
    }
}
