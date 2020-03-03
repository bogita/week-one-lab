package com.labs.foodMenu;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		
		//Add your loop logic to display/read option
		int choice = -1;
		Menu menu = new Menu();
		
		do {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Print Menu options to user");
			
			System.out.print("Enter here: ");
			choice = in.nextInt();
			
			switch(choice) {
				case 1:
						//Print Menu one options 
						menu.printMenuoptions("beef_menu");
					break;
				case 2:
					break;
			
			}
			
		}while(choice != 6);
		
	}

}
