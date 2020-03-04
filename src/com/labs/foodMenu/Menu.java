package com.labs.foodMenu;

public class Menu {

	private String[] beefMenuOptions = { "Beef Meal 1", "Beef Meal 2" };
	private String[] drinksMenuOptions = { "Drink One", "Drink Two", "Drink Three" };
	private String[] vegetarianMenu = {"Veggie Meal 1", "Veggie Meal 2", "Veggie Meal 3"};
	private String[] chickenMenu = {"Chicken Meal 1", "Chicken Meal 2"};
	private String[] sidesMenu = {"Side One", "Side Two", "Side Three"}; 
	
	/*
	 * This method will print the different menu lists depending on the selected menu option
	 * */
	public void printMenuoptions(int menu) {
		
		switch (menu) {
			case 1:
				printMenuList(vegetarianMenu);
				break;
			case 2:
				printMenuList(drinksMenuOptions);
				break;
			case 3:
				printMenuList(beefMenuOptions);
				break;
			case 4: 
				printMenuList(chickenMenu);
				break;
			case 5:
				printMenuList(sidesMenu);
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
		for(int i=0; i < menu.length; i++) {
			System.out.println( (i+1)+". "+menu[i]);
		}
	}

	/*
	 * We will use this method tp print the item user ordered from the menu of choice
	 * 
	 * */
	public void printOrderedMeal(int menu, int item) {
		if(menu == 1) {
			System.out.println("Orderd "+vegetarianMenu[item]+" from Vegetarian Menu");
		}
		else if(menu == 2) {
			System.out.println("Orderd "+drinksMenuOptions[item]+" from Drinks Menu");
		}
		else if(menu == 3) {
			System.out.println("Orderd "+beefMenuOptions[item]+" from Beef Menu");
		}
		else if(menu == 4) {
			System.out.println("Orderd "+chickenMenu[item]+" from Chicken Menu");
		}
		else if(menu == 5) {
			System.out.println("Orderd "+sidesMenu[item]+" from Sides Menu");
		}
	}

}
