/**
 * Question 3: Multiple Inheritance using Interfaces

❓ Problem

Design a Java system for a Smart Device that can perform multiple roles using interfaces (since Java does not support multiple inheritance with classes).

---

📌 Requirements

1. Create two interfaces:

interface Camera { void takePhoto(); } interface MusicPlayer { void playMusic(); }

---

2. Create another interface:

interface SmartFeatures { void connectToWifi(); }

---

3. Create a class SmartPhone that:

· Implements all three interfaces

· Provides implementation for all methods

---

4. In main method:

· Create object of SmartPhone

· Call all methods

---

🧪 Expected Output


Photo captured successfully 
Playing music... 
Connected to WiFi 
 */
package assignments;
interface Camera {
	void takePhoto();
}
interface MusicPlayer {
	void playMusic();
}
interface SmartFeatures {
	void connectToWifi();
}

class SmartPhone implements Camera,MusicPlayer,SmartFeatures {

	@Override
	public void connectToWifi() {
		// TODO Auto-generated method stub
	System.out.println("Connected to WiFi");	
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
	System.out.println("Playing Music.....");		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
	System.out.println("Photo captured successFully");	
	}
	
}
/**
 * 
 */
public class WeeklyAssignment6_Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SmartPhone smartPhone=new SmartPhone();
    smartPhone.takePhoto();
    smartPhone.playMusic();
    smartPhone.connectToWifi();
	}

}
