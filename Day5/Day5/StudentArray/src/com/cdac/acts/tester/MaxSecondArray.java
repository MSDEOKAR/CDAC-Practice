package com.cdac.acts.tester;

import java.util.Arrays;

public class MaxSecondArray {
	//Find max and second max from an array
	public static void main(String[] args) {

		double[] arr = {10.22, 60.52, 90.86, 20.22, 100.32,30.33};
		System.out.println(Arrays.toString(arr));
		double max = arr[0];
		double secondMax = arr[0];

		for (int i = 1; i < arr.length; i++) {
			double element = arr[i];
			if(element > max) {
				secondMax = max;
				max = element;
			} else if(element > secondMax && element < max) {
				secondMax = element;
			}
		}  
		System.out.println("Max=" + max + " Secondmax=" + secondMax);
	}

}
