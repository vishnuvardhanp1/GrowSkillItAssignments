/**
 * Java Map Based Question on Object and Value

Question

Create a Student class with:

· id

· name

Store Student objects as keys in a HashMap and marks as values.

Perform the following:

1. Add 3 students with marks

2. Print all students with marks

---

Output

101 Priya -> 85 102 Aman -> 90 103 Rahul -> 78
 */
package assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Objects;

class StudentRecord {
	int rollno;
	String name;
	
	StudentRecord(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentRecord other = (StudentRecord) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
}
/**
 * 
 */
public class DailyAssignment33_HashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StudentRecord record1=new StudentRecord(101,"Priya");
    StudentRecord record2=new StudentRecord(102,"Aman");
    StudentRecord record3=new StudentRecord(103,"Rahul");
    HashMap<StudentRecord,Integer> map=new LinkedHashMap<StudentRecord,Integer>();
    map.put(record1, 85);
    map.put(record2, 90);
    map.put(record3, 78);
    for(Entry<StudentRecord,Integer> entry:map.entrySet()) {
    	System.out.println(entry.getKey().rollno + " " + entry.getKey().name + " " + entry.getValue());
    }
	}

}
