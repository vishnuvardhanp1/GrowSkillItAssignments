/**
 * 
 */
package assignments;

/**
 * 
 */
public class Weekly_Assignment2_2 {

	/**
	 * @param args
	 */
/*	Q2. Prime Factors of a Number

	Write a program to:

	1. Take a number n

	2. Print all its prime factors

	3. Do not print repeated factors (unique only)

	4. Stop (break) if factor becomes greater than n/2

	👉 Example: Input: n = 60 Output: 2 3 5 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=60;
    
     for(int fact=2;fact<=num;fact++) {
    	 if(fact > num/2)
    		 break;
			
		if(num%fact == 0) {
			boolean isPrime=true;
			for(int i =2; i < fact ;i++) {
			if(fact%i == 0)	 {
				isPrime=false;
				break;
			}
			}
			if(isPrime)
			System.out.print(fact+" ");
			}
		}
     
     

  
	}

}
