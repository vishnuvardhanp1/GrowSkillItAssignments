/**
 * 
 */
package assignments;

/**
 * 1. Product Code Validation

Write a regex to validate a product code that:

· Starts with 2 uppercase letters

· Followed by 3 digits

· Ends with either "X" or "Z"

Valid examples:

· AB123X

· XY999Z

Invalid examples:

· ab123X

· A123X

· AB123A

---
 */
public class DailyAssignment27_Regex1 {

	/**
	 * Product Code Validation
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String regex="^[A-Z]{2}[0-9]{3}[XZ]{1}$";
     //Valid examples
     String productCode="AB123X";
     String productCode1="XY999Z";
     //Invalid Examples
     String productCode2="ab123X";
     String productCode3="A123X";
     String productCode4="AB123A";
     System.out.println(productCode.matches(regex));
     System.out.println(productCode1.matches(regex));
     System.out.println(productCode2.matches(regex));
     System.out.println(productCode3.matches(regex));
     System.out.println(productCode4.matches(regex));
	}

}
