/**
 * 
 */
package assignments;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Question – Sort and Print Using Method Reference

Given:

[40, 10, 30, 20]

Sort the list and print using method reference.
 */
public class WeeklyAssignment9_Stream4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer[] input= {40,10,30,20};
    
    Arrays.stream(input)
    .sorted()
    .forEach(System.out::println);
	}

}
