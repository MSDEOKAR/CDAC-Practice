package com.menu;

import java.util.Scanner;

public class FoodBiller {

	public static void main(String[] args) {
		int choice = 0;
		double bill = 0.0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n *****Menu*****");
			System.out.println("\n 1. Dosa");
			System.out.println("\n 2. Samosa");
			System.out.println("\n 3. Poha");
			System.out.println("\n 4. Tea");
			System.out.println("\n 5. Stop and do billing");

			System.out.println("\n Please enter you selction");
			choice = scanner.nextInt();

			switch(choice) {
			case 1: {
				System.out.println("\nDosa"); 
				bill = bill + 30;
			} break;

			case 2: {
				System.out.println("\nSamosa");
				bill = bill + 20;
			} break;

			case 3:  {
				System.out.println("\nPoha");
				bill = bill + 20;
			}
			break;

			case 4: {
				System.out.println("\nTea");
				bill = bill + 10;
			}break;

			case 5: {
				System.out.println("\nBill =" + bill);
				break;
			}
			}

		} while(choice != 5);


		scanner.close();
	}

}
