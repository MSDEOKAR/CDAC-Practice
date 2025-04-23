package com.cdac.acts;

import java.util.Arrays;

public class ArrayTester {
	
	public static void main(String[] args) {
		float[] farr = null;
		float farr1[] = new float[] {1.0F, 2.0F};
		
		
		System.out.println(farr1.getClass());
		System.out.println(farr1.getClass().getSuperclass());
		System.out.println(farr);
		System.out.println(farr1);
		System.out.println(Arrays.toString(farr1));
		/*float farr2[] = {1.0F, 2.0F};
		System.out.println(farr2);
		System.out.println(farr2.length);
		System.out.println(Arrays.toString(farr2));
		
		farr = new float[10];
		farr[0] = (float)30.0;
		farr[1] = 60.0F;
		farr[2] = 90.0F;
//		for(int i =0; i < farr.length; i++) {
//			System.out.println(farr[i]);
//		}
		
		System.out.println(Arrays.toString(farr));
		String []sarr = new String[10];
		System.out.println(Arrays.toString(sarr));*/
		
	}

}
