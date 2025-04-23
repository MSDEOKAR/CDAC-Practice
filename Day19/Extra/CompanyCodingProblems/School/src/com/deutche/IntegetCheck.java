package com.deutche;

public class IntegetCheck {
	public static void main(String[] args) {
		Integer i1 = new Integer("11");
		Integer i2 = 11;
		Integer i3 = 11;
		if( i1 == i2)
		{
			System.out.println("Integers are equal ==");
		}
		if(i1.equals(i2))
		{
			System.out.println("Integers are equal using equals");
		}
		
		
		if( i3 == i2)
		{
			System.out.println("Integers are equal == 2");
		}
	}

}
