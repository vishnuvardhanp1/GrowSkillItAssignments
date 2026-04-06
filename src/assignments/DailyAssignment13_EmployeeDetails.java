/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment13_EmployeeDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp1=new Employee();
    Employee emp2=new Employee("Priya",101,"HR");
    Employee emp3=new Employee("Rahul",102);
    System.out.println("Employee1 : " + emp1.getName() + ", " + emp1.getId() + ", " + emp1.getDepartment() );
    System.out.println("Employee2 : " + emp2.getName() + ", " + emp2.getId() + ", " + emp2.getDepartment() );
    System.out.println("Employee3 : " + emp3.getName() + ", " + emp3.getId() + ", " + emp3.getDepartment() );
	emp1.setName("Anjali");
	emp1.setId(103);
	emp1.setDepartment("Finance");
	System.out.println("Employee1 : " + emp1.getName() + ", " + emp1.getId() + ", " + emp1.getDepartment() );
	
	}

}
