/**
 * Employee Data
Employee(1, "Priya", 50000)
Employee(2, "Aman", 70000)
Employee(3, "Rohit", 40000)
Question

Using Stream API:

Filter employees whose salary is greater than 45000
Sort them in descending order of salary
Print employee names
Find total salary of filtered employees using mapToInt() and sum()
 */
package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

class EmployeeData {
	int employeeId;
	String name;
	int salary;
	
	public EmployeeData(int employeeId, String name, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

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
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeData other = (EmployeeData) obj;
		return employeeId == other.employeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
}
/**
 * 
 */
public class DailyAssignment35_Streams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData employee=new EmployeeData(1,"Priya",50000);
		EmployeeData employee1=new EmployeeData(2,"Aman",70000);
		EmployeeData employee2=new EmployeeData(3,"Rohit",40000);
		
		//Adding employee objects to a list
		
		List<EmployeeData> employeeList=new ArrayList<EmployeeData>();
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		
		// printing the intial list using stream
		System.out.println("\n  printing the intial list using stream ");
		employeeList.stream()
		.forEach(s->System.out.println(s.employeeId + ":" + s.name + ":" + s.salary));
		
		//Filter employees whose salary is greater than 45000
		System.out.println("\n Filter employees whose salary is greater than 45000 ");
		List<EmployeeData> filteredList=employeeList.stream()
		.filter(s-> s.salary > 40000)
		.collect(Collectors.toList());
		//.forEach(s->System.out.println(s.employeeId + ":" + s.name + ":" + s.salary));
		
		//sort them in descending order using salary
		System.out.println("\n Sort them in descending order using salary");
		employeeList.stream()
		.sorted((a,b)-> b.salary - a.salary)
		.forEach(s->System.out.println(s.employeeId + ":" + s.name + ":" + s.salary));
		
		System.out.println("\n Print Employee names");
		employeeList.stream()
		//.sorted((a,b)-> b.salary - a.salary)
		.forEach(s->System.out.println( s.name ));
		
		//Find total salary of filtered employees using mapToInt() and sum()
		System.out.println("\n Find total salary of filtered employees using mapToInt() and sum()");
		int sum=filteredList.stream().map(EmployeeData::getSalary).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	/*	6. Print 2, 4, 6 … 30

		👉 Conditions:

		· Multiples of 3 → print "Hello"

		· Multiples of 10 → print "Bye"

		· If both → print "Bye" (priority) */
		int i = 2;
		while(i <= 30) { 
			if(i % 10 == 0) {
				System.out.println("Bye"); 
				} else if(i % 3 == 0) { 
					System.out.println("Hello"); 
					} else {
						System.out.println(i); } i += 2; 
						}

	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: "); 
		int num = sc.nextInt();
		int count = 0; 
		while(num != 0)
		{ 
			num = num / 10; 
			count++; 
			} 
		System.out.println("Total digits = " + count);
	}	
	}
	
