package com.cdkglobal;

class A {
	
	public A()
	{
		System.out.println("A()");
	}
	public A(String param)
	{
		this();
		System.out.println("A("+ param+")");
	}
}

class B  extends A{
	
	public B()
	{
		System.out.println("B()");
	}
	public B(String param)
	{
		this();
		System.out.println("B("+ param+")");
	}
}

public class Test{
	public static void main(String[] args) {
		new B("You");
	}
}


