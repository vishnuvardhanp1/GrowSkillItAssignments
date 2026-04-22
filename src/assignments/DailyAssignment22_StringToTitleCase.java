/**
 * 
 */
package assignments;

/**
 * Question 2: Convert String to Title Case

Write a Java program to convert a given string into Title Case (first letter of each word capitalized).

👉 Example: Input: "java programming language" Output: "Java Programming Language"
 */
public class DailyAssignment22_StringToTitleCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java programming language";
		String titleCase="";
		String words[]=str.split(" ");
		for(String s:words) {
		char firstWord=s.charAt(0);
		String upperWord=(firstWord +"").toUpperCase();
		titleCase=titleCase+ upperWord+s.substring(1,s.length())+" ";
		}
		System.out.println(titleCase.trim());

	}

}
