/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment10_PyramidNumberPattern {

	
	public static void printNumberPyramid( int num) {
		for(int row=1;row<=num;row++) {
			//print spaces
			   for(int sp=1;sp<=num-row;sp++) { 
				   System.out.print(" "); 
			   
		   
			}
			   //print increasing numbers
			   for(int j=1;j<=row;j++) {
					
					System.out.print(j );
					
					}
			   //print decreasing numbers
			   for (int j = row - 1; j >= 1; j--) {
	                System.out.print(j);
	            }
			   System.out.println();
		   }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     printNumberPyramid(5);
	}

}
