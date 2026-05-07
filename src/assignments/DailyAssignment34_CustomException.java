/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * Question

Create a custom exception called InvalidPasswordException.

Conditions:

Password length must be at least 8 characters.
If password is less than 8 characters, throw custom exception.
Otherwise print "Password Accepted".
Expected Output
Enter Password: abc

InvalidPasswordException: Password must contain minimum 8 characters
 */
public class DailyAssignment34_CustomException {

	/**
	 * @param args
	 * @throws InvalidPasswordException 
	 */
	public static void main(String[] args) throws InvalidPasswordException {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Password");
    String password=sc.next();
    try {
    if(password.length() < 8)
    	throw new InvalidPasswordException("Password must contain minimum of 8 characters");
    else
    	System.out.println("Password Accepted");
    }catch(Exception ex) {
    	System.out.println("Exception Occured  : " + ex.getMessage());
    }
    finally {
    sc.close();
    }
	}

}
