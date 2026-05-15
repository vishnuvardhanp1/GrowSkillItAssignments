/**
 * Question 3 – Count Vowels in String

Create a functional interface that counts vowels in a string.

Expected Output

Input: automation Output: 6

---
 */
package assignments;

@FunctionalInterface
interface CountVowels {
	int vowels(String input);
}
/**
 * 
 */
public class WeeklyAssignment9_FunctionalInterface3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CountVowels cw= (n) -> {
    	int count=0;
    	String input = n;
    	input=input.toLowerCase();
    	for(int i=0;i<=input.length()-1;i++) {
    	Character c=input.charAt(i);
    	if(c == 'a' || c== 'e' || c =='i' || c =='o' || c== 'u')
    		count++;
    	}
    	return count;
    };
    int output=cw.vowels("Automation");
    System.out.println(output);
	}

}
