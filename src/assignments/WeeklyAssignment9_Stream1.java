/**
 * 
 */
package assignments;

import java.util.Arrays;

/**
 * Question – Filter Names Ending with A

Given:

["Aman", "Riya", "Ankit", "Tushar"]

Print names ending with letter A.
 */
public class WeeklyAssignment9_Stream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] input= {"Aman", "Riya", "Ankit", "Tushar"};
    
    Arrays.stream(input)
    .filter(s->(s.startsWith("A") || s.startsWith("a")))
    .forEach(System.out::println);
    
	}

}
