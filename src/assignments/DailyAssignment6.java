/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment6 {

	/**
	 * @param args
	 */
	public static boolean isArmstrong(int value) {
        int num = value;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            num = num / 10;
        }

        return sum == value;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       boolean isArmstrongNumber=isArmstrong(153);
       if(isArmstrongNumber) {
			System.out.println("Number is  Armstrong number");
		} else {
			System.out.println("Number is not a  Armstrong number");
		}
       
	}

}
