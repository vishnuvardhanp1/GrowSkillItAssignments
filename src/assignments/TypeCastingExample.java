/**
 * 
 */
package assignments;

/**
 * 
 */
public class TypeCastingExample {

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

        TypeCastingExample obj = new TypeCastingExample();

        float marks = obj.getMarks();
        System.out.println("Float value : " + marks);

        double marksDouble = obj.convertToDouble(marks);
        System.out.println("Converted to double : " + marksDouble);

        int marksInt = obj.convertToInt(marks);
        System.out.println("Converted to int : " + marksInt);

        char intCharacter = obj.convertToChar(marksInt);
        System.out.println("Character value is : " + intCharacter);

        System.out.println("ASCII 97 = '" + intCharacter + "'");
        
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
