/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment14_Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ManagerDetails managerDetails=new ManagerDetails("Rajat",50.0,35000);
        DeveloperDetails developerDetails=new DeveloperDetails("Kannan",14000,"Java");
        SeniorDeveloperDetails seniorDeveloperDetails=new SeniorDeveloperDetails("Varun",20000,"Java",9);
        managerDetails.displayDetails();
        developerDetails.diplayDetails();
        seniorDeveloperDetails.displayDetails();
	}

}
