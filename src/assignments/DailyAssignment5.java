/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment5 {

	/**
	 * @param args
	 */
	
	public static void getValues() {
	    int number=1;
	    while(number <= 50) {
	    	if(number%2 == 0 && number%5 == 0) {
	    		System.out.println(number*number);
	    	}
	    	else if(number%2 == 0 ) {
	    		System.out.println(number*number*number);
	    	}
	    	else if(number%5 == 0) {
	    		System.out.println(number*5);
	    	}
	    	else {
	    		System.out.println(number);
	    	}
	    	number++;
	    }
			
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		getValues();
		
	}

}
