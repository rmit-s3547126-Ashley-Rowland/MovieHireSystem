package serverSide;

public class Movie
{

	private String title;
	private String genre;
	private float rentalCharge;
	private int rentalPeriod, releaseYear, copies;
	private float overdueCharge;
	
	
	public Movie(String titleIn, String GenreIn, float rentalChargeIn, int rentalPeriodIn, int releaseYearIn, float overdueChargeIn)
	{
		title = titleIn;
		genre = GenreIn;
		rentalCharge = rentalChargeIn;
		rentalPeriod = rentalPeriodIn;
		releaseYear = releaseYearIn;
		overdueCharge = overdueChargeIn;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public float getRentalCharge()
	{
		return rentalCharge;
	}
	
	public int getRentalPeriod()
	{
		return rentalPeriod;
	}
	
	public int getReleaseYear()
	{
		return releaseYear;
	}
	
	public float getOverdueCharge()
	{
		return overdueCharge;
	}
	
	public boolean setTitle(String newTitle)
	{
		title = newTitle;
		return true;
	}
	
	public boolean setGenre(String newCategory)
	{
		genre = newCategory;
		return true;
	}
	
	public boolean setRentalCharge(float newRentalCharge)
	{
		rentalCharge = newRentalCharge;
		return true;
	}
	
	public boolean setRentalPeriod(int newRentalPeriod)
	{
		rentalPeriod = newRentalPeriod;
		return true;
	}
	
	public boolean setReleaseYear(int newReleaseYear)
	{
		releaseYear = newReleaseYear;
		return true;
	}
	
	public boolean setOverdueCharge(float newOverdueCharge)
	{
		overdueCharge = newOverdueCharge;
		return true;
	}
	
	public void makeCopy(){
		copies++;
	}
	
	public int getCopies(){
		return copies;
	}
	
	public void displayInfo(){
		System.out.println("Movie Title: " + title);
		System.out.println("Genre: " + genre);
		System.out.println("Release year: " + releaseYear);
		System.out.println("Rental Period: " + rentalPeriod);
	}
}