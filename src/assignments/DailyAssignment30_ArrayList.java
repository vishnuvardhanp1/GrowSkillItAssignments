/**
 * 
 */
package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * Question

Create a Java program using a Movie class with the following fields:

movieId
movieName
rating

Perform the following tasks:

Create an ArrayList of Movie objects.
Add at least 4 movies to the list.
Sort the movies according to rating using the Comparator interface.
Display the list before and after sorting.

Before Sorting:
1  Inception  8.8
2  Avatar  7.9
3  Interstellar  9.1
4  Joker  8.4

After Sorting By Rating:
2  Avatar  7.9
4  Joker  8.4
1  Inception  8.8
3  Interstellar  9.1
 */

class Movie {
	int moviedId;
	String movieName;
	double rating;
	
	Movie(int movieId,String movieName,double rating) {
		this.moviedId=movieId;
		this.movieName=movieName;
		this.rating=rating;
		
	}
}

class MovieComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.rating,o2.rating);
	}
	
}
public class DailyAssignment30_ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Movie> movieList=new ArrayList<Movie>();
    movieList.add(new Movie(1,"Inception",8.8));
    movieList.add(new Movie(2,"Avatar",7.9));
    movieList.add(new Movie(3,"Interstellar",9.1));
    movieList.add(new Movie(4,"Joker",8.4));
    System.out.println("Before Sorting");
    for(Movie movie:movieList) {
    	System.out.println(movie.moviedId + " " + movie.movieName + " " + movie.rating);
    }
    Collections.sort(movieList,new MovieComparator() );
    ListIterator<Movie> listIterator=movieList.listIterator();
    System.out.println("After Sorting");
	while(listIterator.hasNext()) {
		Movie m = listIterator.next();
	    System.out.println(m.moviedId + " " + m.movieName + " " + m.rating);
	}
	}

}
