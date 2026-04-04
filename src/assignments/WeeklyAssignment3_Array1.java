/**
 * 
 */
package assignments;

/**
 * 
 */
public class WeeklyAssignment3_Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,1,1};
		int smallest =arr[0];
		int secondSmallest=999999;
		//Traverse and find smallest
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] < smallest) {
				smallest =arr[i];
			}
		}
		//Traverse again to find second smallest
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > smallest && arr[i] < secondSmallest) {
				
					secondSmallest=arr[i];
				
			}
		}
		System.out.println("The smallest element is "+ smallest);
		//Handle case when all elements are same
		if(secondSmallest == 999999) {
		    System.out.println("No second smallest element");
		} else {
		System.out.println("The second smallest element is "+ secondSmallest);
		}
	}

}
