package com.acts.numbers;

import java.util.Scanner;

public class ComplexNumber {
	//Instance members/props
	private int real; // DM or property or attribute
	private int img;
	
	//class vars
	private static int count = 0;

	//Initialization using constructor
	// Special member/instance method with same name
	//as class and no return type

	//implemented NO Arg ctor
	public ComplexNumber() {
		System.out.println("Ctor called"); 
		//		real = 0;
		//		img = 0; 
		this.real = 0;
		this.img = 0; 
		count++;
	}

	//implemented parameterized ctor
	public ComplexNumber(int i) {
		System.out.println(" Parameterized Ctor called"); 
		this.real = i;
		this.img = i; 
		count++;
	}

	//implemented parameterized ctor
	public ComplexNumber(int i, int j) {
		System.out.println(" Parameterized Ctor called"); 
		this.real = i;
		this.img = j; 
		count++;
	}

	//Instance method
	public ComplexNumber add(ComplexNumber c2) {
//		ComplexNumber c3 = new ComplexNumber();
//		c3.real = this.real + c2.real;
//		c3.img = this.img + c2.img;
		//return c3;
return new ComplexNumber(this.real + c2.real, this.img + c2.img);
		
	}
	
//	//class method
//	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
//		ComplexNumber c3 = new ComplexNumber();
//		c3.real = c1.real + c2.real;
//		c3.img = c1.img + c2.img;
//		return c3;
//	}

	//get stringified object data
	public String getString() {
		//this = null; can not change this ref because it is final/const
		return "\n ComplexNumber[ real:" + this.real + ",img:" + this.img +"]";
		//return "\n ComplexNumber[ real:" + real + ",img:" + img +"]";
	}
	
	public int getReal() {
		return real; // this.real;
	}
	
//	public void setReal( int value) {
//		 real = value; // this.real = value;
//	}

	public int getImg() {
		return img;
	}
//
//	public void setImg(int img) {
//		this.img = img;
//	}

	//Static getter to access static count
	public static int getCount() {
		return count;
	}
	
}
