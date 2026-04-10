/**
 * Question 2: Salary Calculation using this Keyword

📌 Problem Statement

Design a Java program to manage employee salary details.

Create a class Employee with the following:

· Instance variables:

o id (int)

o name (String)

o basicSalary (double)

---

🎯 Required Functionality

1. Create a constructor to initialize all values.

2. Create a method calculateSalary() to compute:

o HRA = 20% of basicSalary

o Bonus = 10% of basicSalary

o Total Salary = basicSalary + HRA + Bonus

3. Create a method display() to print:

o id

o name

o basicSalary

o total salary

4. Use this keyword properly inside constructor.
 */
package assignments;


class EmployeeRecord {
	int id;
	String name;
	double basicSalary;
	double totalSalary;
	
	EmployeeRecord(int id,String name,double basicSalary) {
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	void calculateSalary() {
		double hra=(20.0/100)*basicSalary;
		double bonus=(10.0/100)*basicSalary;
		totalSalary=basicSalary+hra+bonus;
		
		
	}
	
	void display() {
		System.out.print("Employee id  : " +  this.id + " Employee name : " + this.name +
				" Employee basic salary : " + this.basicSalary + " Employee Total Salary : " + this.totalSalary);
	}
	
	
}

/**
 * 
 */
public class WeeklyAssignment4_SalaryCalculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRecord employeeRecord=new EmployeeRecord(1, "Kishore", 5000);
		employeeRecord.calculateSalary();
		employeeRecord.display();
	}

}
