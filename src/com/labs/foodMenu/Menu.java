package com.labs.foodMenu;

public class Menu {

	private String[] beefMenuOptions = { "Beef Meal 1", "Beef Meal 2" };
	private String[] drinksMenuOptions = { "Drink One", "Drink Two", "Drink Three" };

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

	private void printMenuList(String[] menu) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + " " + menu[i]+"\n");
		}
	}

	public void printOrderedMeal(int menu, int item) {
		if(menu == 1) {
			System.out.println("Orderd "+beefMenuOptions[item]+" from Beef Menu");
		}
	}

}
