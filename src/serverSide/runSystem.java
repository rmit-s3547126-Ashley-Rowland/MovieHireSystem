package serverSide;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class runSystem {
	
	public static void main(String[] args) throws IOException {
		
		
		
		System.out.println("Welcome to the movie booking system!\n"
						 + "Please indicate whether you're a system admin or a regular user:\n"
						 + "----------------------------------------------------------------\n"
						 + "1. Admin login\n"
						 + "2. Regular user");
		
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		switch(input){
		case 1:
			adminLogin(s);
			break;
		case 2:
			userLogin();
			break;
		case 0:
			//mainRuntimeTest();
		}
		
		
	}
	
	public static void adminLogin(Scanner s){
		System.out.println("Please input your admin ID:");
		int input = s.nextInt();
		
	}
	
	public static void userLogin(){
		
	}
	
}
