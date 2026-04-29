/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * Assignment 1: Basic User Details Input

Write a Java program that:

Uses Scanner to take:
Name (full line)
Age (integer)
Salary (double)
Prints all details in proper format
ðŸŽ¯ Example

Input:

Enter name: Priyanka Arora
Enter age: 25
Enter salary: 35000.50

Output:

Name: Priyanka Arora
Age: 25
Salary: 35000.5
 */
public class DailyAssignment28_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    //sc.nextLine();
    System.out.println("Enter name : ");
    String name=sc.nextLine();
    System.out.println("Enter age : ");
    int age=sc.nextInt();
    System.out.println("Enter Salary : ");
    double salary=sc.nextDouble();
    System.out.println("name : " + name);
    System.out.println("age : " + age);
    System.out.println("salary : " + salary);
    sc.close();
    
	}

}
