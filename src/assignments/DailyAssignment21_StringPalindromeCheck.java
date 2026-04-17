/**
 * 
 */
package assignments;

/**
 * A palindrome is a string that reads the same forward and backward. For example, "madam", "racecar", and "level" are palindromes.

Requirements:
Take a string 
Compare the original string with its reverse.
Display:
"Palindrome" if the string is the same when reversed.
"Not a Palindrome" otherwise.
 */
public class DailyAssignment21_StringPalindromeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="level";
    String reverseString="";
    str=str.toLowerCase();
    for(int i=str.length()-1;i>=0;i--) {
    	reverseString=reverseString+str.charAt(i);	
    }
    if(str.equals(reverseString))
    	System.out.println("Palindrome");
    else
    	System.out.println("Not Palindrome");
	}

}
