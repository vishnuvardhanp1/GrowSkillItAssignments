/**
 * 
 */
package assignments;

/**
 * 
 */
public class TypeCasting {

	/**
	 * @author VISHNU VARDHAN
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         float marks=97.8F;
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
         
        
         System.out.println(" ASCII 97  = '" + intCharacter + "'");
         
         
	}

}
