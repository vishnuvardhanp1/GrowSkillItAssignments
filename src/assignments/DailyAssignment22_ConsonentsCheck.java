/**
 * 
 */
package assignments;

/**
 * Question 1: Count Consonants in a String

Write a Java program to count the number of consonants in a given string.

👉 Example: Input: "Hello World" Output: 7
 */
public class DailyAssignment22_ConsonentsCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Hello World";
    str=str.toLowerCase();
    int count=0;
    for(int i=0;i<str.length();i++) {
    	char ch=str.charAt(i);
    	if(ch >= 'a' && ch <= 'z') {
    	if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
    		//do nothing
    	
    		count++;
    	}
    	}
    	
    	
    }
    System.out.print("Output: " + count);
	}

}
