/**
 * 
 */
package assignments;

import java.util.ArrayList;
import java.util.Comparator;

class EmployeeMgmt {
	int id;
	String name;
	double salary;
	String department;
	
	EmployeeMgmt(int id,String name,double salary,String dept) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.department=dept;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	
	public String toString() {
        return id + " " + name + " " + salary + " " + department;
    }
	
}
/**
 * 
 */
public class DailyAssignment26_EmpMgmt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<EmployeeMgmt> empList=new ArrayList();
    empList.add(new EmployeeMgmt(1,"Naren",82000,"IT"));
    empList.add(new EmployeeMgmt(2,"Vinod",77000,"IT"));
    empList.add(new EmployeeMgmt(3,"Vikram",94000,"IT"));
    empList.add(new EmployeeMgmt(4,"Vikas",43000,"Admin"));
    empList.add(new EmployeeMgmt(5,"Priya",32000,"HR"));
    empList.add(new EmployeeMgmt(6,"Advik",100000,"COE")); 
    System.out.println("Employee Salary greater than 50000 \n"); 
    for(EmployeeMgmt emp : empList) {
    	
    	if(emp.getSalary() > 50000 )
    		System.out.println(emp.getId() + ":" + emp.getName() + ":"  + emp.getSalary() + ":" + emp.getDepartment());
    }
    System.out.println("Sorting employee List");
    empList.sort(Comparator.comparing(e -> e.salary));
    for(EmployeeMgmt emp : empList) {
    	System.out.println(emp);
    }
   // Filtering IT department
    System.out.println("Filtering IT employees");
    for(EmployeeMgmt emp : empList) {
    	if(emp.getDepartment().equals("IT"))
    	System.out.println(emp);
    }
    System.out.println("Highest Paid employee");
    EmployeeMgmt highest = empList.get(0);

    for (EmployeeMgmt e : empList) {
        if (e.salary > highest.salary) {
            highest = e;
        }
    }

    System.out.println("Highest Paid: " + highest);
    
    //Remove employee by id
    empList.remove(5);
    
    //Increase salary by 10%
    System.out.println("Increased salary by 10%");
    for (EmployeeMgmt e : empList) {
        e.salary = e.salary + (e.salary * 0.10);
    }
    
    for(EmployeeMgmt emp : empList) {
    	System.out.println(emp);
    }
    
    
	}

}
