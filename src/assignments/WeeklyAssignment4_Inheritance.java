/**
 * ---

🔴 Question 1:

📌 Problem Statement

Create two classes:

· Person

· Student (inherits Person)

---

🔹 Requirements:

1. Person class:

· Instance variables: name, age

· Constructor to initialize values using this keyword

---

2. Student class:

· Instance variable: marks

· Constructor to initialize:

o name

o age

o marks (use this)

· Method display() to print all details
 */
package assignments;

class Person {
	String name;
	int age;
	
	Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

class Student extends Person {
	int marks;

	Student(String name, int age,int marks) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.marks=marks;
	}
	
	void display()
	{
		System.out.println("Name : "+ this.name + " Age : " + this.age + " Marks : " + this.marks);
	}
	
}

/**
 * 
 */
public class WeeklyAssignment4_Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("Haricharan", 14, 79);
		student.display();
				
	}

}
