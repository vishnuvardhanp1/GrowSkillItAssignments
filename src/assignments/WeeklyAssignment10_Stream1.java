/**
 * 
 */
package assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;



/**
 *Create a class Employee with:

id
name
department
salary
age

Use this sample data:

List<Employee> employees = Arrays.asList(
    new Employee(1, "Rahul", "IT", 75000, 25),
    new Employee(2, "Sneha", "HR", 50000, 30),
    new Employee(3, "Aman", "IT", 90000, 28),
    new Employee(4, "Priya", "Finance", 65000, 32),
    new Employee(5, "Karan", "HR", 45000, 24),
    new Employee(6, "Neha", "IT", 85000, 27)
);
Assignment Questions
Question 1

Using Stream API:

Find all employees whose salary is greater than 70000
Print only their names
Expected Output
Rahul
Aman
Neha 

question2
Group employees by department
Print department name along with employee count
Expected Output
IT -> 3
HR -> 2
Finance -> 1
Using Stream API:
question 3
Find the employee with the highest salary
Print complete employee details
Expected Output
Employee{id=3, name='Aman', department='IT', salary=90000, age=28}
 */
public class WeeklyAssignment10_Stream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeRecords> employees = Arrays.asList(
			    new EmployeeRecords(1, "Rahul", "IT", 75000, 25),
			    new EmployeeRecords(2, "Sneha", "HR", 50000, 30),
			    new EmployeeRecords(3, "Aman", "IT", 90000, 28),
			    new EmployeeRecords(4, "Priya", "Finance", 65000, 32),
			    new EmployeeRecords(5, "Karan", "HR", 45000, 24),
			    new EmployeeRecords(6, "Neha", "IT", 85000, 27)
			);
		
	  employees
	  .stream().filter(n-> n.getSalary() > 70000)
	  .forEach(s->System.out.println(s.name));
	  
	  Map<String, Long> groupList=
			  employees.stream().collect(Collectors.groupingBy(EmployeeRecords::getDepartment,
						Collectors.counting()));
	/*	for(Map.Entry<String,Long> e:groupList.entrySet()) 
		{
			System.out.println(e.getKey() + "->" + e.getValue() );
		}*/
	  groupList.entrySet()
      .stream()
      .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
      .forEach(e ->
          System.out.println(e.getKey() + " -> " + e.getValue())
      );
	  
	  Optional<EmployeeRecords> opt1=
			  employees.stream().sorted(Comparator.comparing(EmployeeRecords::getSalary).reversed()).findFirst();
	  System.out.println(opt1.get());
	}

}
