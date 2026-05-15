/**
 * 
 */
package assignments;

import java.util.Arrays;

/**
 *Question – Filter Strings with Length Greater Than 5

Given:

["Java", "Automation", "API", "Playwright"]

Print strings whose length is greater than 5. 
 */
public class WeeklyAssignment9_Stream2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] input = {"Java", "Automation", "API", "Playwright"};
    
    Arrays.stream(input)
    .filter(s-> s.length() > 5)
    .forEach(System.out::println);
    
	}

}
