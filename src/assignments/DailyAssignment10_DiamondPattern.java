/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment10_DiamondPattern {

	
	public static void printDiamond(int num) {
		//upperhalf
		for(int row=1;row<=num;row++) {
			
			for(int sp=1;sp<=num-row;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=2*row-1;star++) {
				System.out.print("*");
				
			}
			
			System.out.println("");
		}	
		// Lower half
        for (int row = num - 1; row >= 1; row--) {

            // Print spaces
            for (int sp = 1; sp <= num - row; sp++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         printDiamond(5);
	}

}
