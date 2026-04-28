/**
 * 
 */
package assignments;

/**
 * 2. Email Username Constraint

Create a regex for an email username (before @) such that:

· Can contain letters, digits, underscore

· Must start with a letter

· Length should be 5 to 12 characters

Valid:

· hello_123

· user12

Invalid:

· 1hello

· ab@
 */
public class DailyAssignment27_Regex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String regex="^[a-zA-Z][a-zA-Z0-9_]{4,11}$";
	     //Valid examples
	     String emailPrefix="hello_123";
	     String emailPrefix1="user12";
	     //Invalid Examples
	     String emailPrefix2="1hello";
	     String emailPrefix3="ab@";
	    
	     System.out.println(emailPrefix.matches(regex));
	     System.out.println(emailPrefix1.matches(regex));
	     System.out.println(emailPrefix2.matches(regex));
	     System.out.println(emailPrefix3.matches(regex));
	     
	}

}
