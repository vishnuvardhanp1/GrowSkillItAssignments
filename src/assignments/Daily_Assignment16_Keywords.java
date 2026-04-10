package assignments;


class Company {
	final String companyName="TCS";
	String location;
	
	Company(String location) {
		this.location=location;
	}
	
}

class EmployeeUser extends Company {
    int id;
    String name;
	EmployeeUser(String location,int id,String name) {
		super(location);
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	
}
public class Daily_Assignment16_Keywords {
	public static void main(String[] args) {
		EmployeeUser emp=new EmployeeUser("Coimbatore", 1, "Abinav");
		System.out.print(emp.id + ":" + emp.name + ":" + emp.location + ":" +emp.companyName);
	}
}
