package com.acts.numbers;

public class ComplexUtils {
	//class method
	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
//		ComplexNumber c3 = new ComplexNumber();
//		c3.setReal(c1.getReal() + c2.getReal());
//		c3.setImg(c1.getReal() + c2.getReal());
//		return c3;
		return new ComplexNumber(c1.getReal() + c2.getReal(),
				c1.getImg() +c2.getImg());
	}
}
