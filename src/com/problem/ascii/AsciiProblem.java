package com.problem.ascii;

import java.util.Scanner;

public class AsciiProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a characher: ");
		String userInput = in.next();
		
		System.out.println("Ascii value = "+(int)userInput.charAt(0));
		
		System.out.print("Enter number : ");
		int number = in.nextInt();
		
		System.out.println("Char value = "+(char)number);
		
	}

}
