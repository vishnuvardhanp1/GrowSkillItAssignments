/**
 * 
 */
package assignments;

import java.util.Arrays;

/**
 * Question – Print List Using Method Reference

Given:

["A", "B", "C"]

Print all elements using:

System.out::println
 */
public class WeeklyAssignment9_Stream3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] input= {"A", "B", "C"};
    
    Arrays.stream(input)
    .forEach(System.out::println);
	}

}
