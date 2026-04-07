/**
 * 
 */
package assignments;

/**
 * 
 */
public class SeniorDeveloperDetails extends DeveloperDetails {
	
	int experiance;

	/**
	 * @param name
	 * @param salary
	 * @param progLanguage
	 */
     SeniorDeveloperDetails(String name, double salary, 
			String progLanguage,int experiance) {
		super(name, salary, progLanguage);
		// TODO Auto-generated constructor stub
		this.experiance=experiance;
	}
     
     void displayDetails() {
    	 super.displayDetails();
    	 System.out.println("Experiance is : " + experiance);
     }
	
	

}
