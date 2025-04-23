package com.acts;

public class GenericType<T> {
	private T num1;
	
	public GenericType(T num1) {
		super();
		this.num1 = num1;
	}

	@Override
	public String toString() {
		return "GenericType [num1=" + num1 + "]";
	}
	
}
