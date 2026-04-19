/**
 * 
 */
package assignments;




/**
 * Question 1: Inheritance + Constructor

Create a class Book with:

· attributes: title, author

· constructor to initialize values

· method display()

Create a subclass EBook with:

· additional attribute fileSize

· constructor using super

Expected Output:

Title: Atomic Habits Author: James Clear File Size: 5MB

Question 2: Method Overriding

· In Book, create method getDescription()

· Override it in EBook class

✅ Expected Output:

This is a physical book. This is an electronic book.

Question 3: Static Keyword

· Create static variable libraryName

· Static method showLibrary()

✅ Expected Output:

Library: City Library

---
 */

class Book {
	String title;
	String author;
	static String libraryName;
	final int ISBN=12345;
	
	Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	void display() {
		
		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);
	}
	void getDescription() {
	System.out.println("This is a physical book");	
	
	}
	
	static void showLibrary() {
		System.out.println("Library : " + libraryName );
		
	}
	
	
	
}

class Ebook extends Book {
	String fileSize;
	Ebook(String title,String author,String fileSize) {
		super(title,author);
		super.display();
		this.fileSize=fileSize;
		System.out.println("FileSize : " + this.fileSize);
	}
	
	void getDescription() {
		super.getDescription();
		System.out.println("This is an electronic book");	
		}
}
public class WeeklyAssignment5_Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Ebook ebook=new Ebook("Atomic Habits","James Clear","5MB");
    //ebook.display();
    ebook.getDescription();
    Book.libraryName="City Library";
    Book.showLibrary();
    //error comes as final variable cannot be changed
   // ebook.ISBN=23456;
    System.out.println("ISBN  : " + ebook.ISBN);
    ebook.title="Java programming";
    System.out.println("Uppercase : " + ebook.title.toUpperCase());
    System.out.println("Length : " + ebook.title.length());
    System.out.println("Contains Java: " + ebook.title.contains("Java"));
    
	}

}
