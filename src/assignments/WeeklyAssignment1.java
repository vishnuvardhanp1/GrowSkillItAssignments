/**
 * 
 */
package assignments;

/**
 * 
 */
public class WeeklyAssignment1 {

	/**
	 * @auyhor vishnuvardhan P
	 * @param args
	 */
	public static double convertFloatToDouble(float marks) {
        return (double) marks;
    }

    public static int convertDoubleToInt(double marksDouble) {
        return (int) marksDouble;
    }

    public static char convertIntToChar(int marksInt) {
        return (char) marksInt;
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	float marks=87.6F;
		System.out.println("float value is : " + marks);
		double marksDouble=(double) marks;
		System.out.println("double value is : " + marksDouble);
		int marksInt=(int)marksDouble;
		System.out.println("Integer value is : " + marksInt);
		char ascii=(char)marksInt;
		System.out.println("Character value is : " + ascii); */
		
		
	        float marks = 87.6F;

	        double marksDouble = convertFloatToDouble(marks);
	        int marksInt = convertDoubleToInt(marksDouble);
	        char ascii = convertIntToChar(marksInt);

	        System.out.println("float value is : " + marks);
	        System.out.println("double value is : " + marksDouble);
	        System.out.println("Integer value is : " + marksInt);
	        System.out.println("Character value is : " + ascii);
	   

	}

}
