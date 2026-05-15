/**
 * Question 2 – Reverse a String

Create a functional interface to reverse a string using lambda expression.

Expected Output

Input: engineer Output: reenigne
 */
package assignments;

@FunctionalInterface
interface ReverseString {
	String reverseString(String input);
}
/**
 * 
 */
public class WeeklyAssignment9_FunctionalInterface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ReverseString rs= (n) -> {
    	String output="";
    	for(int i=n.length()-1;i>=0;i--) {
    		output += n.charAt(i);
    	}
		return output;
    	
    };
    String reverse=rs.reverseString("engineer");
    System.out.println(reverse);
	}

}
