/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment8_2_PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=6;
     int sum=0;
     for(int i=1;i<num;i++) {
    	 if(num%i == 0) {
    		 sum=sum+i;
    	 System.out.println(i+ " is proper divisor");
    	
    	 }
     }
     System.out.println(sum+ " total sum");
     if(sum == num) { 
    	 System.out.println(num + " is perfect number");
	
     } else {
        System.out.println(num + " is NOT a perfect number ");
    }
	}

}
