package week11Assignment;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {


	public static void main(String[] args) throws Exception {
		
	    Stream<Movie> myStream = Movie.movieList.stream();
		
		Stream<String> stringStream = myStream.map(movie -> movie.toString());
		
		stringStream = stringStream.sorted();
		
		String delimitedString = stringStream.map(String::valueOf).collect(Collectors.joining("," ));
		
		System.out.println(delimitedString);

	}

	

}
