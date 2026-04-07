package assignments;

public class ManagerDetails extends EmployeeDetails{
	
	double bonus;

	ManagerDetails(String name, double salary,double bonus) {
		super(name, salary);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Bonus for the Manager is : " + bonus);
	}

}
