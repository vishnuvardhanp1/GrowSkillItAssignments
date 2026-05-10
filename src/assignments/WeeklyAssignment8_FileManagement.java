/**
 * 
 */
package assignments;
import java.io.*;

/**
 * 
 */
public class WeeklyAssignment8_FileManagement {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	System.out.println(System.getProperty("user.dir"));
	File file = new File("src/assignments/data.txt");
    FileReader fr=new FileReader(file);
    BufferedReader br=new BufferedReader(fr);
    String st="";
    int noOflines=0;
    int noOfWords=0;
    int noOfCharacters=0;
    String longest="";
    try {
    while((st = br.readLine()) != null) {
    String words[]=st.split("\\s+");
    noOfCharacters += st.length();
    for(String word:words) {
    	noOfWords++;
    	
    	if(word.length() > longest.length())
    		longest=word;
    	
    	
    }
    
    noOflines++;
    }
    }catch(IOException e) {
    	System.out.println(e.getMessage());
    }
    System.out.println("The total no of lines is " + noOflines);
    System.out.println("The total no of words is " + noOfWords);
    System.out.println("The total no of characters is " + noOfCharacters);
    System.out.println("The longest words is " + longest);
    br.close();
	}

}
