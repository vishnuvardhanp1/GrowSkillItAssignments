package assignments;
/**
 * 
 */
class StudentUser {

	    // Variables
	    private int rollNo;
	    protected String name;
	    public String course;

	    // Method to set student details
	    void setStudentDetails(int rollNo, String name, String course) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.course = course;
	    }

	    // Method to display student details
	    void displayStudentDetails() {
	        System.out.println("Student Details:");
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Course: " + course);
	    }

	    // 🔹 Inner Class Address
	    class Address {
	        private String city;
	        String state; // default access

	        void setAddress(String city, String state) {
	            this.city = city;
	            this.state = state;
	        }

	        void displayAddress() {
	            System.out.println("\nAddress Details:");
	            System.out.println("City: " + city);
	            System.out.println("State: " + state);
	        }
	    }

	    // 🔹 Inner Class College
	    class College {
	        private String collegeName;

	        void setCollege(String collegeName) {
	            this.collegeName = collegeName;
	        }

	        void displayCollege() {
	            System.out.println("\nCollege Details:");
	            System.out.println("College Name: " + collegeName);
	        }
	    }
	}
/**
 * 
 */
public class DailyAssignment19_InnerClass {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 1. Create Student object
        StudentUser studentObj = new StudentUser();

        // 2. Set and display student details
        studentObj.setStudentDetails(101, "Vishnu", "Computer Science");
        studentObj.displayStudentDetails();

        // 3. Create Address inner class object
        StudentUser.Address addr = studentObj.new Address();

        // 4. Set and display address
        addr.setAddress("Coimbatore", "Tamil Nadu");
        addr.displayAddress();

        // 5. Create College inner class object
        StudentUser.College col = studentObj.new College();

        // 6. Set and display college details
        col.setCollege("PSG College of Technology");
        col.displayCollege();
	}

}
