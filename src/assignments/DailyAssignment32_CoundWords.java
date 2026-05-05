/**
 * 
 */
package assignments;
import java.util.*;
import java.util.Map.Entry;

/**
 * Question 1: Count Occurrence of Words using Map

Write a Java program to count the occurrence of each word in a string using HashMap.

Input

Java is easy and Java is powerful

Output

Java = 2 is = 2 easy = 1 and = 1 powerful = 1
 */
public class DailyAssignment32_CoundWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String sentence="Java is easy and Java is powerful";
    String words[]=sentence.split(" ");
    Map<String,Integer>  map=new LinkedHashMap<String,Integer>();
    int count=0;
    for(String word:words) {
    	if(map.containsKey(word)) {
    		count=map.get(word);
    		count +=1;
    		
    		
    	} else {
    		count=1;
    		
    	}
    	map.put(word, count);
    	
    	
    }
    for(Entry<String,Integer> entry : map.entrySet()) {
    	System.out.println(entry.getKey() + " = " +entry.getValue());
    }
	}

}
