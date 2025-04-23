package com.cdac.acts.tester;

import java.util.Arrays;

import com.cdac.acts.ArrayPrinter;

public class ArrayTester {

	public static void main(String[] args) {
		double[] arr = {10.20, 20.20, 30.30};
		System.out.println(arr);
		ArrayPrinter.printArray(arr);
		
		for(int i =0 ; i < arr.length; i++) {
			arr[i] = 100.100;
		}
		
		ArrayPrinter.printArray(arr);
		//Utility Array class
		System.out.println(Arrays.toString(arr));
	}

}
