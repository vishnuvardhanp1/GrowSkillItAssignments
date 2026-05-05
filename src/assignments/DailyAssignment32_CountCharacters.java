/**
 * 
 */
package assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Question 2: Convert aaabbc into a3b2c1

Write a Java program to count consecutive characters in a string using Map or normal logic.

Input

aaabbc

Output

a3b2c1
 */
public class DailyAssignment32_CountCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String characters="aaabbc";
    Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
    for(int i=0;i<=characters.length()-1;i++) {
    char ch=characters.charAt(i);
    int count=0;
    if(map.containsKey(ch)) {
    	count=map.get(ch);
    	count +=1;
    } else {
    	count =1;
    }
    map.put(ch, count);
    }
    for(Entry<Character,Integer> entry:map.entrySet()) {
    	System.out.print(entry.getKey() + ""+ entry.getValue());
    }
	}

}
