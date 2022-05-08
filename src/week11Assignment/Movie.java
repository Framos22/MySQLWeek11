package week11Assignment;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private String name;
	private int rating;
	
	
	
	public Movie(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
		
		
	}
	@Override
	public String toString() {
		return "Movie (name=" + name + ", rating=" + rating + ")";
	}
	public String getName() {
		return name;
	}
	public int getRating() {
		return rating;
	}
	
	public static int compare(Movie one, Movie two) {
		return one.getName().compareTo(two.getName());
	}
	
	public static List<Movie> movieList = new ArrayList<Movie>() {{
		add(new Movie("DoctorStrange", 7)); 
		add(new Movie("DumbandDumber", 9));
		add(new Movie("HappyGillmore", 9));
		add(new Movie("BalckPanther", 10));
}};

}
