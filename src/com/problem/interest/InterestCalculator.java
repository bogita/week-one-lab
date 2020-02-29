package com.problem.interest;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		//Main method calculation
		System.out.println("Enter Total Amount: ");
		double amount = in.nextDouble();

		System.out.println("Enter total years : ");
		int years = in.nextInt();

		System.out.println("Enter monthly interest : ");
		double interest = in.nextDouble();

		double compoundInterest = calculateInterest(amount, interest, years);
		System.out.println("Total Interest is : " + compoundInterest);

		
		// Static Method call example
		UserData staticUserDataInput = UserDataReader.staticUserDataReader();
		double staticResult = calculateInterest(staticUserDataInput);
		System.out.println("Total Interest is : " + staticResult);

		
		// Initialize example
		UserDataReader userDataReader = new UserDataReader();
		UserData userDataInput = userDataReader.userDataReader();
		double readerResult = calculateInterest(userDataInput);
		System.out.println("Total Interest is : " + readerResult);

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
