/**
 * 
 */
package assignments;

/**
 * Question 2: Abstract Class (Real-World Design)

❓ Problem

Design a Java program for an E-commerce Payment System using an abstract class.

---

📌 Requirements

1. Create an abstract class Payment:

o Instance variable: amount

o Abstract method:

void makePayment();

o Concrete method:

void paymentDetails() // prints amount

---

2. Create subclasses:

o CreditCardPayment

o UPIPayment

---

3. Each subclass should:

o Override makePayment()

o Print payment-specific message:

§ Credit card → card number used

§ UPI → UPI ID used

---

4. In main method:

o Create objects using dynamic polymorphism

o Call both methods

---

🧪 Expected Output

Payment Amount: 5000 Paid 5000 using Credit Card ending with 1234 Payment Amount: 1500 Paid 1500 using UPI ID: user@upi
 */

abstract class Payments {
	int amount;
	abstract void makePayment();
	void paymentDetails() {
		System.out.print(" Payment Amount: " + amount);
	}
}

class UPIPayments extends Payments {
    
	
	void makePayment() {
		// TODO Auto-generated method stub
		super.paymentDetails();
		System.out.print ( " Paid " + super.amount + " using UPI ID:user@upi");
				
	}
	
}

class CreditCardPayments extends Payments {
  
	
	void makePayment() {
		// TODO Auto-generated method stub
		super.paymentDetails();
		System.out.print ( " Paid " + super.amount + " using Credit Card ending with 1234 ");
				
	}
	
}
public class WeeklyAssignment6_AbstractClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Payments p=new CreditCardPayments();
    p.amount=5000;
    p.makePayment();
    System.out.println();
    Payments p1=new UPIPayments();
    p1.amount=1500;
    p1.makePayment();
	}

}
