/**
 * 
 */
package assignments;

/**
 * 
 */
public class Weekly_Assignment2_1 {

	/**
	 * @param args
	 */
	/*
	 * Write a Java program to:

1. Print Fibonacci series up to n terms

2. Stop printing using break if any number in the series becomes greater than 100

👉 Example: Input: n = 10 Output: 0 1 1 2 3 5 8 13 21 34 55 89

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=10;
     int first=0;
     int second = 1;
     for(int i=0; i<n;i++) {
    	 
    	 if(first > 100)
    		 break;
    	 
    	
    	 System.out.print(first + " ");
    	 
    	 int next=first+second;
    	 first=second;
    	 second=next;
    	 
     }
	}

}
