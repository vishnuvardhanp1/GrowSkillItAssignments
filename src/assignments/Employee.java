/**
 * 
 */
package assignments;

/**
 * 
 */
public class Employee {
	
	//Create Private Variables
	
	private String name;
	private int id;
	private String department;
	
	/**
	 * 
	 */
	Employee() {
		name="Unknown";
		id=0;
		department="Not Assigned";
	}
	//Parameterized Constructor to intialize all fields
	/**
	 * @param name1
	 * @param id1
	 * @param department1
	 */
	Employee(String name1,int id1,String department1) {
		name=name1;
		id=id1;
		department=department1;
	}
	/* 3. Implement constructor overloading:

o One constructor that takes only name and id */
	
	/**
	 * @param name1
	 * @param id1
	 */
	Employee(String name1,int id1) {
		name=name1;
		id=id1;
		department="General";
		
	}
    //Implement Getters and setters
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
	
	

}
