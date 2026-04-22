/**
 * 
 */
package assignments;

/**
 * Question 

Write a Java program to calculate the sum of all numbers (not just digits) in a string.

ðŸ‘‰ Example:
Input: "ab12cd34"
Output: 46 (12 + 34)
 */
public class DailyAssignment23_SumOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="ab12cd34";
     
     String temp="";
     int sum=0;
     
     for(int i=0;i<=str.length()-1;i++) {
    	 char ch=str.charAt(i);
    	 if(Character.isDigit(ch)) {
    		temp+=ch; 
    	 }
    	 else {
    		if(!temp.isEmpty()) {
    		sum+=Integer.parseInt(temp);
    		temp="";
    		}
    	 }
     }
     if(!temp.isEmpty()) {
 		sum+=Integer.parseInt(temp);
 		temp="";
 		}
     System.out.println("Output : " + sum);
	}
	
	

}
