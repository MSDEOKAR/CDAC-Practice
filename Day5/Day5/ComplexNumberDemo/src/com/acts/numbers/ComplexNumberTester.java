package com.acts.numbers;

import java.util.Scanner;

public class ComplexNumberTester {

	public static void main(String[] args) {
		//reference if ComplexNumber
		ComplexNumber c1 = new ComplexNumber(5, 5); //Init
		System.out.println(c1);
		System.out.println(c1.getString());
		
		ComplexNumber c2 = new ComplexNumber(10, 20); //Init
		System.out.println(c2);
		System.out.println(c2.getString());
		
		ComplexNumber c5 = new ComplexNumber(1, 2); //Init
		
//		ComplexNumber result = c1.add(c2);
//		System.out.println(result.getString());
//		
//		ComplexNumber result1 = result.add(c5);
//		System.out.println(result1.getString());
		
		ComplexNumber result = c1.add(c2).add(c5);
		System.out.println(result);
		
		ComplexNumber result2 = ComplexUtils.add(c1, c2);
		System.out.println(result2);
		
		System.out.println(ComplexNumber.getCount());
		//this reference is always referring to Invoking Object/ref
		
//		ComplexNumber c3 = c2; // Init
//		System.out.println(c3);
//		System.out.println(c3.getString());
//		
//		ComplexNumber c4;
//		c4 = c1; // Assignment
//		System.out.println(c4);
//		System.out.println(c4.getString());
		
		
		

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("\n Please enter real:"); 
//		int i = scanner.nextInt();
//
//		System.out.println("\n Please enter img:");
//		int j = scanner.nextInt();
//
//		ComplexNumber c2 = new ComplexNumber(i, j);
//		System.out.println(c2);
//		System.out.println(c2.getString());
//		
//		scanner.close(); 
	}

}
