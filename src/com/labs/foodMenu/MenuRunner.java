package com.labs.foodMenu;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		
		//Declare your initial values
		int choice = 6;
		Menu menu = new Menu();

		System.out.println("Welcome to claim food menu options!");
		System.out.println("Choose an option to continue");
		System.out.println("\t1. View Vegetarian Menu");
		System.out.println("\t2. View Drinks Menu");
		System.out.println("\t3. View Beef Menu");
		System.out.println("\t4. View Chicken Menu");
		System.out.println("\t5. View Sides Menu");
		System.out.println("\t6. proceed to order");
		
		do {
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("\nEnter the menu you wish to view or enter 6 to exit: ");
			choice = in.nextInt();
			
			menu.printMenuoptions(choice);
			
		}while(choice != 6);
		
		Scanner in = new Scanner(System.in);
		
		//Once we exit after choice 6
		System.out.println("\n\nWhich menu do you want to order from? ");
		int orderMenuId = in.nextInt();
		menu.printMenuoptions(orderMenuId);
		
		System.out.println("\nWhich meal do you wish to order? ");
		int mealId = in.nextInt();
		menu.printOrderedMeal(orderMenuId, mealId);
		
	}

}
