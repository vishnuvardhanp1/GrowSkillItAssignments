/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment12_MatrixAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1[][]= {{1,2,3,4},{5,6,7,8},{9,1,2,3}};
		int marks2[][]= {{4,3,2,1},{8,7,6,5},{3,2,1,0}};
		int max=0;
		for(int row=0;row <=marks1.length-1 ;row ++) {
			
				for(int col=0;col<=marks1[row].length-1;col++) {
				
			//System.out.println(marks1[row][col] +  " " );	
			//System.out.println(marks2[row1][col1] +  " ");	
			System.out.print(marks1[row][col]  + marks2[row][col] +  " ");
			if((marks1[row][col]  + marks2[row][col]  > max)) {
				max=marks1[row][col]  + marks2[row][col] ;
			}
			System.out.println();
			}
				
			System.out.println("----------");
		}
		System.out.println(" Maximum element is " + max);
	}

}
