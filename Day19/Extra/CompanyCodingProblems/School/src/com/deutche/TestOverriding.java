package com.deutche;

interface I1{
	Object method();
}

interface I2{
	String method();
}


public class TestOverriding implements I1, I2 {

	@Override
	public String method() {
		return "String";
	}
	
	public static void main(String[] args) {
		System.out.println(new TestOverriding().method());
	}

}

//case 1 return type of interface1 is object and child is String it works
//case 2 return type of itereface1 is Object and  return type of itereface2 is string and child is String it works
//case 3 return type of itereface1 is Object and  return type of itereface2 is string and child is ObjectS / error
