public class CGPACalculator {
    public static void main(String[] args) {

        double[][] gradePoints = {
            {3.50, 3.25, 3.75, 3.00, 4.00},
            {3.75, 2.50, 3.00, 4.00, 2.75},
            {3.50, 2.25, 4.00, 4.00, 3.75},
            {2.50, 3.75, 3.75, 3.50, 3.00},
            {2.75, 3.00, 2.50, 4.00, 4.00}
        };

        int[] credits = {3, 4, 2, 3, 3};

        for (int i = 0; i < gradePoints.length; i++) {

            double totalPoints = 0;
            int totalCredits = 0;

            for (int j = 0; j < gradePoints[i].length; j++) {

                totalPoints += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }
            
            double cgpa = totalPoints / totalCredits;
            System.out.printf("Student %d CGPA: %.2f%n", i + 1, cgpa);
        }
    }
}