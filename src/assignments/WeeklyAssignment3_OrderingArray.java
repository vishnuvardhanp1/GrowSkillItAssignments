/**
 * 
 */
package assignments;

/**
 * 
 */
public class WeeklyAssignment3_OrderingArray {
	
	static void moveZeros(int arr[]) {

	        int index = 0; // position to place non-zero

	        // Step 1: Move non-zero elements forward
	        for (int i = 0; i < arr.length; i++) {
	        	if (arr[i] != 0) {

	                // swap arr[i] and arr[index]
	                int temp = arr[i];
	                arr[i] = arr[index];
	                arr[index] = temp;

	                index++;
	            }
	        }
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 0, 3, 9, 0};

        moveZeros(arr);

        // Print result
        System.out.print("[");
        for (int num=0;num <arr.length;num++) {
            System.out.print(arr[num] );
            if (num < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println();
        
	}

}
