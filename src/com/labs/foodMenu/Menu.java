package com.labs.foodMenu;

public class Menu {

	private String[] beefMenuOptions = { "Beef Meal 1", "Beef Meal 2" };
	private String[] drinksMenuOptions = { "Drink One", "Drink Two", "Drink Three" };

	/*
	 * This method will print the different menu lists depending on the selected menu option
	 * */
	public void printMenuoptions(int menu) {
		
		switch (menu) {
			case 1:
				printMenuList(beefMenuOptions);
				break;
			case 2:
				printMenuList(drinksMenuOptions);
				break;
		}
	
	}

	/*
	 * We will use this method to print different items in the menu
	 * It should print the item with index + 1 to the user
	 * Ex. 1. Beef Meal 1
	 * Note Beef Meal 1 is in index 1
	 * */
	private void printMenuList(String[] menu) {
		//Use for loop to print list
	}

	/*
	 * We will use this method tp print the item user ordered from the menu of choice
	 * 
	 * */
	public void printOrderedMeal(int menu, int item) {
		if(menu == 1) {
			System.out.println("Orderd "+beefMenuOptions[item]+" from Beef Menu");
		}
	}

}
