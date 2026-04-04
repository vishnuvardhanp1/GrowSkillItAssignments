/**
 * 
 */
package assignments;

/**
 * 
 */
public class WeeklyAssignment3_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,7,2,9,1};
		//int arr[] = {1,1,1,1,1,1};
		int smallest;
		int secondSmallest;
		//intialize smallest and second smallest
		if(arr[0] < arr[1]) {
			smallest=arr[0];
			secondSmallest=arr[1];
		} else {
			smallest=arr[1];
			secondSmallest=arr[0];
		}
		//Traverse and find smallest
		for(int i=2;i<arr.length;i++) {
			
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest =arr[i];
			} else if (arr[i] > smallest && arr[i] < secondSmallest) {
				secondSmallest=arr[i];	
			}
		}
	
		System.out.println("The smallest element is "+ smallest);
		
		//Handle case when all elements are same
		if(secondSmallest == smallest) {
		    System.out.println("No second smallest element");
		} else {
		System.out.println("The second smallest element is "+ secondSmallest);
		} 
	}

}
