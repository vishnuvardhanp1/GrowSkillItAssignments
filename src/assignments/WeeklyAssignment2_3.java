/**
 * 
 */
package assignments;

/**
 * 
 */
/**
 * Q3. Digit Transformation Logic (Advanced)

Write a program to:

1. Take a number n

2. Traverse digits from right to left

3. Apply following rules:

o If digit is at odd place AND digit ≤ 4 → multiply by 2

o If digit is at even place→ replace with 1

o Else keep at it is i.e digit at odd place and >4

4. Form a new number from the result

👉 Example: Input: n = 57243

Step-by-step: Position (right se):

· 3 (pos 1, odd ≤4) → 6

· 4 (2nd place,even) → 1

· 2 (3rd , odd place and less than <=4) → 4

· 7 (4th place,even) → 1

· 5 (5th place,odd but is >=5) → 5
 */
public class WeeklyAssignment2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57243;
		//track odd/even
		int pos = 1;
		int result = 0;
		//build number correctly
		int place = 1;

		while(n > 0) {
			//get last digit
		    int digit = n % 10;
            // identify odd position and digit <=4
		    if(pos % 2 != 0 && digit <= 4) {
		        digit = digit * 2;
		    }
		    //identify even position
		    else if(pos % 2 == 0) {
		        digit = 1;
		    }

		    result = result + (digit * place);

		    place = place * 10;
		    pos++;
		    //remove last digit
		    n = n / 10;
		}
		System.out.println(result);
	}

}
