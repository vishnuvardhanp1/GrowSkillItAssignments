/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment15_LeftRotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++) {
        	arr[i]=arr[i];
        }
        arr[arr.length-1]=first;
        for(int num :arr) {
        	System.out.print(num + " ");
        }
	}

}
