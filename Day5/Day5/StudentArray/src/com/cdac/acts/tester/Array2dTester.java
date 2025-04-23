package com.cdac.acts.tester;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
public class Array2dTester {
	public static void main(String... args) {
		Scanner scanner = new Scanner(in);
		out.println("please enter size of symetric matrix");
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		//create an arrays
		int m1[][] = new int[r][c];
		int m2[][] = new int[r][c];
		
		//get input from user
		out.println("please enter maxtix elements first matrix");
		getMatrixInput(scanner, r, c, m1);
		
		out.println("please enter maxtix elements for second matrix");
		getMatrixInput(scanner, r, c, m2);
		out.println("First matrix");
		print2dArray(r, m1);
		out.println("Second matrix");
		print2dArray(r, m2);
		
		int[][] res = multiplyMatrix(m1, m2, r, c);
		out.println("Result matrix");
		print2dArray(r, res);
		
		scanner.close();

	}

	
	private static int[][] multiplyMatrix(int[][] m1, int[][] m2, int r, int c) {
		int result[][] = new int[r][c];
		for( int i =0; i < r; i++) {
			for( int j =0; j < c; j++) {
				for( int k = 0; k < c; k++) {
					result[i][j] =  result[i][j] + m1[i][k] * m2[k][j];
				}
			}
		}
		return result;
	}
	private static void getMatrixInput(Scanner scanner, int r, int c, int[][] m1) {
		for( int i =0; i < r; i++) {
			for( int j =0; j < c; j++) {
				m1[i][j]= scanner.nextInt();
			}
		}
	}
	
	private static void print2dArray(int r, int[][] m1) {
		for( int i =0; i < r; i++) {
			out.println(Arrays.toString(m1[i]));
		}
	}
}
