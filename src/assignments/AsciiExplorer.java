/**
 * 
 */
package assignments;
import java.util.Scanner;
/**
 * 
 */
public class AsciiExplorer {

	/**
	 * @author Vishnuvardhan P
	 * @param args
	 */
	
	public static int getAsciiValue(char inputCharacter) {
        return (int) inputCharacter;
    }

    public static int addFiveToAscii(int ascii) {
        return ascii + 5;
    }

    public static char convertToChar(int ascii) {
        return (char) ascii;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char inputCharacter='A';
    // System.out.println("Enter character :" + inputCharacter);
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Character : ");
     inputCharacter = sc.next().charAt(0);

     System.out.println("You entered: " + inputCharacter);

     int ascii = getAsciiValue(inputCharacter);
     System.out.println("The ASCII value is : " + ascii);

     int updatedAscii = addFiveToAscii(ascii);
     System.out.println("The new ASCII values is : " + updatedAscii);

     System.out.println("The new Character is : " + convertToChar(updatedAscii));

     sc.close();
		 
     
     
	}

}
