/**
 * 
 */
package assignments;


/**
 * 
 */
public class DailyAssignment2 {
/*
 * Problem Statement

Write a Java program where:

A float variable marks = 97.8f is given
Convert it into:
double (upcasting)
int (downcasting)
Convert the final int value into a character (ASCII conversion)
Print all intermediate and final values

âœ… Output Explanation
Float value: 97.8
Converted to double: 97.8
Converted to int: 97
Character value: a

ðŸ‘‰ ASCII 97 = 'a'
 */
	
	/**
	 * @author VISHNU VARDHAN
	 * @param args
	 */
	
		public float getMarks() {
	        return 97.8F;
	    }

	    public double convertToDouble(float marks) {
	        return (double) marks;
	    }

	    public int convertToInt(float marks) {
	        return (int) marks;
	    }

	    public char convertToChar(int marksInt) {
	        return (char) marksInt;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        DailyAssignment2 obj = new DailyAssignment2();

        float marks = obj.getMarks();
        System.out.println("Float value : " + marks);

        double marksDouble = obj.convertToDouble(marks);
        System.out.println("Converted to double : " + marksDouble);

        int marksInt = obj.convertToInt(marks);
        System.out.println("Converted to int : " + marksInt);

        char intCharacter = obj.convertToChar(marksInt);
        System.out.println("Character value is : " + intCharacter);

        System.out.println("ASCII 97 = '" + intCharacter + "'");
        
        //Code without oops
        
        /* float marks=97.8F;
         System.out.println("Float value : " + marks);
         
         // double upcasting
         double marksDouble=(double) marks;
         System.out.println("Converted to double : " + marksDouble);
         
         // int downCasting
         int marksInt=(int) marks;
         System.out.println("Converted to int : " + marksInt);
         
         // converting int to char
         char intCharacter=(char) marksInt;
         System.out.println("Character value is : " + intCharacter);
         
        
         System.out.println(" ASCII 97  = '" + intCharacter + "'"); */
         
         
	}

}
