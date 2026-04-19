/**
 * 
 */
package assignments;

/**
 * Assignment 2: Vehicle Class (Different Context)

🔹 Question 1: Inheritance + Constructor

Create class Vehicle:

· attributes: brand, speed

Create subclass Car:

· attribute: fuelType

· use constructor with super

✅ Expected Output:

Brand: Hyundai Speed: 120 Fuel Type: Petrol

Question 2: Method Overriding

· Method run() in Vehicle

· Override in Car

✅ Expected Output:

Vehicle is running Car is running smoothly

Question 3: Static Variable & Method

· Static variable company

· Static method displayCompany()

✅ Expected Output:

Company: AutoWorld Ltd

Question 4: Final Method

· Create final method engineType() in Vehicle

· Try overriding in Car (should give error)

✅ Expected Output:

Engine type: Standard Engine Error: cannot override final method

---

🔹 Question 5: String Methods

Take brand name and:

· Reverse string

· Replace characters

· Check equality

✅ Expected Output:

Reversed: iadnuyH Replaced: H*nd** Equals Hyundai: true
 */

class Vehicle {
	String brand;
	int speed;
	Vehicle(String brand,int speed) {
		this.brand=brand;
		this.speed=speed;
	}
	
	void run() {
		System.out.println("Vehicle is running");
	}
	
	final void engineType() {
		System.out.println("engine type");
	}
}
class Car extends Vehicle {
	String fuelType;
	Car(String brand, int speed,String fuelType) {
		super(brand, speed);
		this.fuelType=fuelType;
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println("Brand : " + super.brand + " speed : " + super.speed + " fueltype : " + this.fuelType);
	}
	
	void run() {
		super.run();
		System.out.println("Car is running smoothly");
	}
	
/*	void engineType() {
		
	} */

	
	
}
public class WeeklyAssignment5_Assignment2 {

	static String company;
	 
	static void displayCompany() {
		System.out.println("Company : " + company);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car car=new Car("Hyundai",120,"Petrol");
    car.display();
    car.run();
    company="Autoworld Ltd";
    displayCompany();
    String str = car.brand;
    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        reversed += str.charAt(i);
    }
    System.out.println("Reverse : " + reversed);
    String result = str.replaceAll("[aeiouAEIOU]", "*");

    System.out.println("Replaced: " + result);
    System.out.println("Equals Hyundai: " + str.equals("Hyundai"));
	}

}
