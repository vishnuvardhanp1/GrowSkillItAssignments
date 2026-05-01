/**
 * 
 */
package assignments;

import java.util.Scanner;
import java.util.Stack;

/**
 *  Reverse a String Using Stack

Question:
Take a string input from the user and reverse it using Stack<Character>.

Example:

Input:

hello

Output:

olleh
 */
public class DailyAssignment29_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack<Character> stack=new Stack<Character>();
    Scanner sc=new Scanner(System.in);
   String str=sc.next();
   sc.close();
   for(int i=0;i<=str.length()-1;i++) {
	   stack.push(str.charAt(i));
	   
   }
   System.out.println("Input " + str);
   System.out.print("Output ");
   while(!stack.empty()){
	   System.out.print(stack.pop());
   }
   
    
	}

}
