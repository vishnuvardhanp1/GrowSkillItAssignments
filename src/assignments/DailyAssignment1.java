/**
 * 
 */
package assignments;
/**
 * 
 */
public class DailyAssignment1 {

	/**
	 * @author Vishnuvardhan P
	 * @param args
	 */
	
	public byte getAge() {
        return 44;
    }

    public short getMarks() {
        return 450;
    }
    
    public byte getBatteryPercentage() {
        return 100;
    }

    public int getCityPopulation() {
        return 2500000;
    }

    public char getGrade() {
        return 'A';
    }

    public int getBankBalance() {
        return 5000000;
    }

    public boolean isUserLoggedIn() {
        return true;
    }

    public int getDistanceToCollege() {
        return 1200;
    }

    public long getLargeNumber() {
        return 9000000000L;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// With oop
			DailyAssignment1 s=new DailyAssignment1();
		
		 	System.out.println("Age: " + s.getAge());
	        System.out.println("Marks: " + s.getMarks());
	        System.out.println("Battery: " + s.getBatteryPercentage() + "%");
	        System.out.println("City Population: " + s.getCityPopulation());
	        System.out.println("Grade: " + s.getGrade());
	        System.out.println("Bank Balance: " + s.getBankBalance());
	        System.out.println("Login Status: " + s.isUserLoggedIn());
	        System.out.println("Distance: " + s.getDistanceToCollege() + " meters");
	        System.out.println("Large Number: " + s.getLargeNumber());
	        
	       // without oops
		
 /*   byte age=44;
    short marks=450;
    byte mobileBatteryPercentage=100;
    int cityPopulation = 2500000;
    char grade='A';
    int bankBalance=5000000;
    boolean userLoginStatus=true;
    int distanceToCollegeInMeters = 1200;
    long largeNumber = 9000000000L;*/
		
 /*   System.out.println("Age: " + age);
    System.out.println("Marks: " + marks);
    System.out.println("Battery: " + mobileBatteryPercentage + "%");
    System.out.println("City Population: " + cityPopulation);
    System.out.println("Grade: " + grade);
    System.out.println("Bank Balance: " + bankBalance);
    System.out.println("Login Status: " + userLoginStatus);
    System.out.println("Distance: " + distanceToCollegeInMeters + " meters");
    System.out.println("Large Number: " + largeNumber);*/
		
	}

}
