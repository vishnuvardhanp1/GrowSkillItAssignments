package assignments;

/*
 * Assignment Question: Interface Implementation

Problem Statement:
Design a Java program using an interface to model a simple payment system.

ðŸ§© Requirements:
Create an interface named Payment with:
A method void pay(double amount)
Create two classes:
CreditCardPayment
UPIPayment
Both classes should:
Implement the Payment interface
Provide their own implementation of the pay() method
Print appropriate messages like:
"Paid â‚¹500 using Credit Card"
"Paid â‚¹500 using UPI"
Create a Main class:
Instantiate both payment methods
Call the pay() method with different amounts



ðŸ–¥ï¸ Expected Output
Paid â‚¹500.0 using Credit Card
Paid â‚¹1000.0 using UPI
 */

interface payment {
	void pay(double amount);
}

class CreditCardPayment  implements payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
	System.out.println(" Paid Rs," + amount + " using credit card");	
	}
	
}

class UPIPayment implements payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(" Paid Rs," + amount + " using UPI");	
	}
	
}

public class DailyAssignment25_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPayment ccPayment=new CreditCardPayment();
		UPIPayment upiPayment=new UPIPayment();
		ccPayment.pay(500.0);
		upiPayment.pay(1000.0);
	}

}
