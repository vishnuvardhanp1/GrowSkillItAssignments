package assignments;

import java.util.Objects;

/*
 * Create a class Employee with:

id
name
department
salary
age
 * 
 * 
 */
public class EmployeeRecords {
	
	int id;
	String name;
	String department;
	int salary;
	int age;
	
	public EmployeeRecords(int id, String name, String department, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, department, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeRecords other = (EmployeeRecords) obj;
		return age == other.age && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name) && salary == other.salary;
	}

	@Override
	public String toString() {
		return "EmployeeRecords [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", age=" + age + "]";
	}
	
	
	
	
	

}
