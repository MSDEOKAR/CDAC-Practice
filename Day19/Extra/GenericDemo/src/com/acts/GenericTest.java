package com.acts;

public class GenericTest {
	public static void main(String[] args) {
		GenericType<Integer> type =  new GenericType<>(10);
		System.out.println(type);
		
		GenericType<Double> type1 =  new GenericType<>(10.20);
		System.out.println(type1);
		
		GenericType<String> type2 =  new GenericType<>("Hello");
		System.out.println(type2);
		
	}

}
