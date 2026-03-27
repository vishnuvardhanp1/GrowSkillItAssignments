/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment7 {

	/**
	 * @param args
	 */
	/*
	 * write a program to check if a number
		is prime or not


	Eg   21 not prime
     7  prime
    39  not prime
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        int n = 7;   // change this value to test

		        int count = 0;

		        for(int i = 1; i <= n; i++) {
		            if(n % i == 0) {
		                count++;
		            }
		        }

		        if(count == 2) {
		            System.out.println(n + " is Prime");
		        } else {
		            System.out.println(n + " is Not Prime");
		        }
		    }
		

}
