/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment15_NonRepeatingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {4,5,1,2,0,4};
		//int arr[] = {4,5,5,1,2,0,4};
	//	int arr[]= {1,1,2,2};
    //int arr[]= {4,5,1,2,0,4};
 /*   boolean found=false;
    	
    	for(int i=0;i<arr.length;i++) {
    	int count=0;
    	
    	for(int j=0;j<arr.length;j++) {
    		if(arr[i] == arr[j]) 
    			count++;
    	}
    	
    	if(count == 1) {
    		System.out.println(arr[i]);
    		found=true;
    		break;
    	}
    		
    	
    	
    }
    	
	
    	 if (!found) {
             System.out.println("No unique element");
         } */
    	 
    	 
		int arr[]= {4,5,1,2,0,4};
	//int arr[] = {4,5,5,1,2,0,4};
	//	int arr[]= {1,1,2,2};

    	 int k = 0;
    	 int selectedValue;
    	 boolean found = false;

    	 while (k < arr.length) {

    	     selectedValue = arr[k];
    	     int count = 0;

    	     for (int i = 0; i < arr.length; i++) {

    	         if (i != k && selectedValue == arr[i]) {
    	             count++;
    	         }
    	     }

    	     if (count == 0) {
    	         System.out.println(selectedValue);
    	         found = true;
    	         break;
    	     }

    	     k++;
    	 }

    	 if (!found) {
    	     System.out.println("No unique element");
    	 }
    	
	
	
	}
	

}
