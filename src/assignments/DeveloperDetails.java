/**
 * 
 */
package assignments;

/**
 * 
 */
public class DeveloperDetails  extends EmployeeDetails{
	
	String progLanguage;

	/**
	 * @param name
	 * @param salary
	 * @param progLanguage
	 */
	DeveloperDetails(String name, double salary,String progLanguage) {
		super(name, salary);
		// TODO Auto-generated constructor stub
		this.progLanguage=progLanguage;
	}
	
	/**
	 * 
	 */
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programmin Language Selected by developer is : "+ progLanguage);
	}

	
}
