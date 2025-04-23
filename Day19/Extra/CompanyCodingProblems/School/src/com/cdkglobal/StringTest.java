package com.cdkglobal;

public class StringTest {

	public static  void append(String s1)
	{
		s1 = s1+ "second part";
	}
	
	public static void main(String[] args) {
		String s1 = "first part";
		append(s1);
		System.out.println(s1);
	}
}
