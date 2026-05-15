/**
 * Question 1 – Convert String to Uppercase

Create a functional interface that accepts a string and returns it in uppercase.

Expected Output

Input: hello java Output: HELLO JAVA
 */
package assignments;

@FunctionalInterface
interface UpperCaseConversion {
	String convertToUppercase(String input);
}
/**
 * 
 */
public class WeeklyAssignment9_FunctionalInterface1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCaseConversion ucc= (n) -> {
			return n.toUpperCase();
		};
		String output=ucc.convertToUppercase("gsit admin");
		System.out.println(output);
	}

}
