package com.labs.foodMenu;

public class Menu {

	private String[] beefMenuOptions = { "Beef Meal 1", "Beef Meal 2" };
	private String[] drinksMenuOptions = { "Drink One", "Drink Two", "Drink Three" };

	public void printMenuoptions(String menu) {
		
		switch (menu) {
			case "beef_menu":
				printMenuList(beefMenuOptions);
				break;
			case "drinks_menu":
				printMenuList(drinksMenuOptions);
				break;
		}
	
	}

	private void printMenuList(String[] menu) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + " " + menu[i]+"\n");
		}
	}

}
