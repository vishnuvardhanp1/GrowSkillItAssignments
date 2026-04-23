package assignments;

/*
 * 
 * Write a Java program to check whether two given strings are anagrams of each other or not.

Two strings are said to be anagrams if:

· They contain the same characters

· The frequency of each character is the same

· Order of characters can be different


---

📥 Sample Input

Enter first string: Listen Enter second string: Silent

📤 Sample Output

The strings are Anagrams

---

📥 Sample Input 2

Enter first string: Hello Enter second string: World

📤 Sample Output 2

The strings are NOT Anagrams
 * 
 * 
 * 
 * 
 */

public class DailyAssignement24_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "Listen";
		    String b = "Silent";
           a=a.toLowerCase();
           b=b.toLowerCase();
		    for (char ch : a.toCharArray()) {
		        b = b.replaceFirst(String.valueOf(ch), "");
		    }

		    System.out.println(b.isEmpty() ? "The strings are Anagrams" : "The strings are not Anagrams");
	}

}
