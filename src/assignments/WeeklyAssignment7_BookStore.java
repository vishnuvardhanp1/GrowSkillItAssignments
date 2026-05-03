/**
 * 
 */
package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Assignment 1: Book Management System using ArrayList

Create a class Book with:

· bookId

· bookName

· price

Store objects inside an ArrayList<Book> and perform multiple operations.

Operations to Perform

1. Add 4 books

2. Display all books

3. Sort books based on price (ascending)

4. Remove a book using bookId

5. Update price of one book

6. Search a book by name

7. Display final list

---

Expected Output

Original List: 101 Java 499 102 Python 399 103 SQL 299 104 C++ 599 After Sorting by Price: 103 SQL 299 102 Python 399 101 Java 499 104 C++ 599 After Removing Book ID 102: 103 SQL 299 101 Java 499 104 C++ 599 After Updating Price: 103 SQL 349 101 Java 499 104 C++ 599 Book Found: Java

Final List: 103 SQL 349 101 Java 499 104 C++ 599

---
 */

class BookStore implements Comparable<BookStore> {
	int bookId;
	String bookName;
	int price;
	
	BookStore(int bookId,String bookName,int price) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}

	@Override
	public int compareTo(BookStore o) {
		// TODO Auto-generated method stub
		return this.price-o.price;
	}


	
	
}
public class WeeklyAssignment7_BookStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<BookStore> bookList=new ArrayList<BookStore>();
    bookList.add(new BookStore(101,"Java",499));
    bookList.add(new BookStore(102,"Python",399));
    bookList.add(new BookStore(103,"SQL",299));
    bookList.add(new BookStore(104,"C++",599));
    System.out.println("Original List");
    for(BookStore book:bookList) {
    	System.out.println(book.bookId + " " + book.bookName + " " + book.price);
    }
    
    Collections.sort(bookList);
    System.out.println("Sorting by price");
    for(BookStore book:bookList) {
    	System.out.println(book.bookId + " " + book.bookName + " " + book.price);
    }
    ListIterator<BookStore> itRemove = bookList.listIterator();

    while (itRemove.hasNext()) {
        BookStore b = itRemove.next();
        if (b.bookId == 102) {
        	itRemove.remove();
        }
    }
    System.out.println("After removing BookId 102 : ");
    for(BookStore book:bookList) {
    	System.out.println(book.bookId + " " + book.bookName + " " + book.price);
    }
    ListIterator<BookStore> itUpdate = bookList.listIterator();

    while (itUpdate.hasNext()) {
    	BookStore b = itUpdate.next();
        if (b.bookName.equals("SQL")) {
            b.price = 349; // update price
        }
    }
    System.out.println("After updating price for BookId 103 : ");
    for(BookStore book:bookList) {
    	System.out.println(book.bookId + " " + book.bookName + " " + book.price);
    }
    
    for (BookStore b : bookList) {
        if (b.bookName.equals("Java")) {
            System.out.println("Book Found: " + b.bookName);
        }
    }
    
    System.out.println("Final List : ");
    for(BookStore book:bookList) {
    	System.out.println(book.bookId + " " + book.bookName + " " + book.price);
    }
	}

}
