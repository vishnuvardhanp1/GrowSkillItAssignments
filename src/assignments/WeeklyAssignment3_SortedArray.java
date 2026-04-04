/**
 * 
 */
package assignments;

/**
 * 
 */
public class WeeklyAssignment3_SortedArray {

	
	/**
	 * @param arr
	 * @return
	 */
	static boolean isSorted(int arr[])
	{
		
		 for(int i = 1; i < arr.length; i++) {
		        if(arr[i] < arr[i - 1]) {
		            return false;
		        }
		    }

		    return true;
	
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3,4};
       // int arr[]= {1,3,2};
      //  int arr[]= {-1,0,1};
        boolean isAscending=isSorted(arr);
        System.out.println(isAscending);
        
	}

}
