package com.cdac.acts;

import java.util.Arrays;

public class ArrayTester2 {
	
	public static void main(String[] args) {
		float[][] farr = null;
		farr = new float[2][3];
		farr[0][0] = 10.0F;
		farr[1][2] = 20.0F;
		System.out.println(Arrays.toString(farr[0]));
		System.out.println(Arrays.toString(farr[1]));
		
		double farr1[][] =  {{30.30, 60.60},
							 {90.90, 180.180, 360.360}};
		System.out.println(Arrays.toString(farr1[0]));
		System.out.println(Arrays.toString(farr1[1]));
		
		double farr2[][] =  new double[2][2];
		System.out.println(Arrays.toString(farr2[0]));
		System.out.println(Arrays.toString(farr2[1]));
		
		double farr3[][] =  new double[2][];
		farr3[0] = new double[] {1.0, 2.0};
		farr3[1] = new double[] {1.0, 2.0, 3.0, 4.0};
		System.out.println(Arrays.toString(farr3[0]));
		System.out.println(Arrays.toString(farr3[1]));
		
		double farr4[][] =  new double[2][];
		farr3[0] = new double[2];
		farr3[1] = new double[5];
		System.out.println(Arrays.toString(farr3[0]));
		System.out.println(Arrays.toString(farr3[1]));
		
		
	}

}
