/**
 * 
 */
package assignments;

import java.util.LinkedHashSet;

/**
 *  Remove Duplicate Words from a String
Problem Statement

Create a Java program to remove duplicate words from a given string while keeping only the first occurrence of each word.

The program should:

Take a sentence as input
Split the sentence into words
Remove repeated words
Display the final string without duplicates

Use:

String
ArrayList or LinkedHashSet
Looping concepts
Sample Input
Input:
java is easy and java is powerful and easy
Expected Output
Output:
java is easy and powerful
 */
public class DailyAssignment31_LinkedHastSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String sentence="java is easy and java is powerful and easy";
    String[] words=sentence.split(" ");
    LinkedHashSet<String> linkedHashset=new LinkedHashSet<String>();
    for(String word:words) {
    	linkedHashset.add(word);
    }
    System.out.println(linkedHashset);
    for(String word : linkedHashset) {
    	System.out.print(word + " ");	
    }
	}

}
