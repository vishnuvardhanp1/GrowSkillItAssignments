/**
 * 
 */
package assignments;

/**
 * 
 */
public class EmployeeDetails {
	
	String name;
	double salary;
	
	/**
	 * @param name
	 * @param Salary
	 */
	EmployeeDetails(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	/**
	 * 
	 */
	void displayDetails() {
		
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary is : " + salary);
	}

}
