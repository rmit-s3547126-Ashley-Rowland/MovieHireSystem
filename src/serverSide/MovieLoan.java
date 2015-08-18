package serverSide;

import java.time.LocalDate;

public class MovieLoan {
	
	private String hireID;
	private LocalDate hireDate;
	
	public String getHireID(){
		return hireID;
	}
	
	public void setHireID(String customer){
		hireID = customer;
	}
	
	public LocalDate getHireDate(){
		return hireDate;
	}
	
	public void setHireDate(LocalDate today){
		hireDate = today;
	}
}
