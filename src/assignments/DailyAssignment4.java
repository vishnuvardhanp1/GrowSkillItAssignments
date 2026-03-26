/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment4 {
	
	public static String getResult(int m1, int m2, int m3, int m4, int m5) {

        // Fail condition
        if (m1 < 33 || m2 < 33 || m3 < 33 || m4 < 33 || m5 < 33) {
            return "Result: Fail\nGrade: F";
        }

        // Calculate percentage
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        String grade;

        // Assign grade
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        return "Result: Pass\nPercentage: " + percentage + "\nGrade: " + grade;
    }
	
	public static void main(String[] args) {

        int m1 = 85, m2 = 21, m3 = 37, m4 = 92, m5 = 87;

        String result = getResult(m1, m2, m3, m4, m5);
        System.out.println(result);
    }

}
