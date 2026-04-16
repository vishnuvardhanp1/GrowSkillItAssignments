/**
 * Design a Java program based on the following requirements:

1. Create a class named Student.

2. Inside the class:

o Declare the following variables:

§ private int rollNo

§ protected String name

§ public static String collegeName

§ private static int studentCount

3. Use a static block to initialize collegeName to "ABC College" and print:

Static block executed

4. Create:

o A constructor to initialize rollNo and name

o Increment studentCount inside the constructor

5. Create a public static method displayStudentCount() to print total number of students.

6. Create a non-static method displayDetails() to print student details (rollNo, name, collegeName).

7. In another class Main:

o Create at least 2 objects of Student

o Call both:

§ displayDetails() using objects

§ displayStudentCount() using class name



Static block executed 
Roll No: 1 
Name: Priya 
College: ABC College 
Roll No: 
2 Name: Rahul 
College: ABC College 
Total Students: 2
 */
package assignments;
class StudentDetails {
	private int rollno;
	protected String name;
	public static String collegeName;
	private static int studentCount;
	
	static {
		collegeName="ABC College";
		System.out.println("Static block executed");
	}
	
	StudentDetails(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
		studentCount++;
	}
	
	public static void displayStudentCount() {
		System.out.println("Total Students:  " + studentCount);
	}
	
	void displayDetails() {
		System.out.println("Roll No: " + this.rollno);
		System.out.println("Name: " + this.name);
		System.out.println("College: " + collegeName);
	}
}
/**
 * 
 */
public class DailyAssignment20_Static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails studentObj1=new StudentDetails(1,"Priya");
		
		StudentDetails studentObj2=new StudentDetails(2,"Rahul");
		studentObj1.displayDetails();
		studentObj2.displayDetails();
		StudentDetails.displayStudentCount();
	}

}
