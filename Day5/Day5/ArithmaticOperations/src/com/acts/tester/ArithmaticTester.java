package com.acts.tester;
import java.util.Scanner;
import com.acts.operations.ArithmaticOperations;

public class ArithmaticTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter 2 nos");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = ArithmaticOperations.add(x,y);
		System.out.println("\n Sum="+ z);
		
		byte b = 4;
		int z1 = ArithmaticOperations.add(x,b);
		System.out.println("\n Sum="+ z1);
		
		double d1 =10.20;
		double d2 =30.60;
		double z2 = ArithmaticOperations.add(d1,d2);
		System.out.println("\n Sum="+ z2);
		sc.close();
		
	}
}