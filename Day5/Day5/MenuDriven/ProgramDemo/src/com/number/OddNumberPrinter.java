package com.number;

import java.util.Scanner;

public class OddNumberPrinter {
	public static void main(String[] args) {
		System.out.println("\n Enter range");
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();
		int no2 = scanner.nextInt();

		for(int i = no1; i <= no2 ; i = i + 1) {
			if(i%2 == 0) {
				continue;
			}
			
			System.out.println("\n odd no=" + i);
		}

		scanner.close();
	}


}
