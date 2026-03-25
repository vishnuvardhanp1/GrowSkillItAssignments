/**
 * 
 */
package assignments;

/**
 * 
 */
public class ResultProgram {

    public static String getResult(int m1, int m2, int m3, int m4, int m5) {
        if (m1 < 33 || m2 < 33 || m3 < 33 || m4 < 33 || m5 < 33) {
            return "Fail-F";
        } else {
            return "Pass";
        }
    }

    public static void main(String[] args) {
        int m1 = 45, m2 = 67, m3 = 32, m4 = 78, m5 = 90;

        String result = getResult(m1, m2, m3, m4, m5);

        if(result.equals("Fail-F")) {
            System.out.println("Result: Fail");
            System.out.println("Grade: F");
        } else {
            System.out.println("Result: Pass");
        }
    }
}