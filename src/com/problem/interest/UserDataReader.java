package com.problem.interest;

import java.util.Scanner;

public class UserDataReader {

	public UserDataReader() {
		System.out.println("Hey you finally initialized me!!!");
	}
	
	public static UserData staticUserDataReader() {
		UserData userData = new UserData();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Total Amount: ");
		userData.amount = in.nextDouble();

		System.out.println("Enter total years : ");
		userData.years = in.nextInt();

		System.out.println("Enter monthly interest : ");
		userData.interest = in.nextDouble();

		return userData;
	}
	
	public UserData userDataReader() {
		UserData userData = new UserData();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Total Amount: ");
		userData.amount = in.nextDouble();

		System.out.println("Enter total years : ");
		userData.years = in.nextInt();

		System.out.println("Enter monthly interest : ");
		userData.interest = in.nextDouble();

		return userData;
	}

}
