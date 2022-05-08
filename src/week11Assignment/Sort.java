package week11Assignment;

import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		SortMovies();
		
		for(Movie temp : Movie.movieList ) {
		System.out.println(temp.toString());
		
		}
	}
		
	
	public static void SortMovies() {
		
		Collections.sort(Movie.movieList, ((o1, o2) -> Movie.compare(o1, o2)));
	}
	
	

}
