/**
 * 
 */
package assignments;

/**
 *  Question 1: Longest Common Prefix (String Array/List)
❓ Problem
You are given a list of strings. Write a Java program to find the longest common prefix among all the strings.
If there is no common prefix, return an empty string "".


🧪 Example 1
Input: ["flower", "flow", "flight"]
Output: "fl"

🧪 Example 2
Input: ["dog", "racecar", "car"]
Output: ""

🧪 Example 3
Input: ["interview", "internet", "internal", "interval"]
Output: "inte"
 */
public class WeeklyAssignment6_Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    

		       String[] strs = {"flower", "flow", "flight"};
		      //  String[] strs = {"dog", "racecar", "car"};
		//String[] strs = {"interview", "internet", "internal", "interval"};
		        String prefix = strs[0];

		        for (int i = 1; i < strs.length; i++) {

		            int j = 0;

		            while (j < prefix.length() && j < strs[i].length()
		                    && prefix.charAt(j) == strs[i].charAt(j)) {
		                j++;
		            }

		            prefix = prefix.substring(0, j);
		        }

		        System.out.println(prefix);
		    
		
        


	}

}
