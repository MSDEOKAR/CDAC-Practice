package com.menu;

import java.util.Scanner;

public class FoodBillerString {

	public static void main(String[] args) {
		String choice = "";
		double bill = 0.0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n *****Menu*****");
			System.out.println("\n  Dosa");
			System.out.println("\n  Samosa");
			System.out.println("\n  Poha");
			System.out.println("\n  Tea");
			System.out.println("\n  Bill");

			System.out.println("\n Please enter you selction");
			choice = scanner.next();

			switch(choice.toUpperCase()) {
			case "DOSA": {
				System.out.println("\nDosa"); 
				bill = bill + 30;
			} break;

			case "SAMOSA": {
				System.out.println("\nSamosa");
				bill = bill + 20;
			} break;

			case "POHA":  {
				System.out.println("\nPoha");
				bill = bill + 20;
			}
			break;

			case "TEA": {
				System.out.println("\nTea");
				bill = bill + 10;
			}break;

			case "BILL": {
				System.out.println("\nBill =" + bill);
				break;
			}
			}

		} while(!choice.equalsIgnoreCase("BILL"));


		scanner.close();
	}

}
