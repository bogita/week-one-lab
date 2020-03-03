package com.problem.interest;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		
		String algorithmChoice = null;
		
		
		do {
			//Prompt User
			Scanner in = new Scanner(System.in);
			System.out.println("Which algorithm would you like to run. ");
			System.out.println("Static or Regular");
			
			algorithmChoice = in.next();
			
			if("static".equalsIgnoreCase(algorithmChoice)) {
				//Run static code
				// Static Method call example
				UserData staticUserDataInput = UserDataReader.staticUserDataReader();
				double staticResult = calculateInterest(staticUserDataInput);
				System.out.println("Total Interest from static calculator : " + staticResult+"\n\n");
			}
			else if("regular".equalsIgnoreCase(algorithmChoice)) {
				//Run regular code 
				// Initialize example
				UserDataReader userDataReader = new UserDataReader();
				UserData userDataInput = userDataReader.userDataReader();
				double readerResult = calculateInterest(userDataInput);
				System.out.println("Total Interest from regular calculator : " + readerResult+"\n\n");
			}else {
				System.out.println("You entered an invalid choice. Try again\n\n");
			}
			
		} while( !"stop".equalsIgnoreCase(algorithmChoice) && !"exit".equalsIgnoreCase(algorithmChoice) );
		

		System.out.println("\n\n Calculations Done!");
	}

	public static double calculateInterest(double amount, double interest, int years) {
		double totalInterest = (amount * (1 + (interest / years)));
		return totalInterest;
	}

	public static double calculateInterest(UserData userData) {
		double totalInterest = (userData.amount * (1 + (userData.interest / userData.years)));
		return totalInterest;
	}

}
