package week11Assignment;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {

	public static void main(String[] args) {
		
		callingMovieMethod();

	}
	
	public static Movie moviesMethod(Optional<Movie> optionalMovie) {
		
		/* if(optionalMovie.isPresent()) {
			return optionalMovie.get();
			
		}else {
			
			throw new NoSuchElementException("Object is empty. this is custom");
		}*/
		
		return optionalMovie.orElseThrow(() -> new NoSuchElementException("The object is empty. This is a custom message!"));
		
	}
	
	public static  void callingMovieMethod() {
		
		try
        {
            // Creating an optional method with a Movie object
            Optional <Movie> movieToPass = Optional.of(new Movie("SpiderGirl", 5)); 

            // Call movie method with our variable
            Movie returnedMovie = moviesMethod(movieToPass);

            // Print it out
            System.out.println(returnedMovie.toString());

            // Create an empty optional
            Optional <Movie> emptyMovie = Optional.empty();

            // Cause the exception to happen
            moviesMethod(emptyMovie);
        }
        catch(NoSuchElementException e)
        {
            // Exception encountered
            System.out.println(e.getMessage());
        }
	
}
	
}



