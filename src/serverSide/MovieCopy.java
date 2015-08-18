package serverSide;

import java.time.LocalDate;

public class MovieCopy{

	private int MovieID;
	private LocalDate purchaseDate;
	private String condition;
	private boolean isAvailable = true;
	private int timesRented = 0;
	private Movie movie;
	
	public MovieCopy(Movie movie, int MovieID, LocalDate purchaseDate, String condition){
		this.MovieID = MovieID;
		this.purchaseDate = purchaseDate;
		this.condition = condition;
		this.movie = movie;
		movie.makeCopy();
	}
	
	public void displayInfo(){
		movie.displayInfo();
		
		System.out.println("Condition: " + condition);
		System.out.println("Available: " + isAvailable);
	}
	
}
