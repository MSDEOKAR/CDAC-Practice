package com.cdac.acts;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private String course;
	
//	public Student() {
//		this.rollNo =0;
//		this.name = "";
//		this.course = "";
//	}

	public Student(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	public void printStudent() {
		System.out.println("\n*****Student Data starts******");
		System.out.println("Student Roll No : "+ rollNo);
		System.out.println("Student Name : "+ name);
		System.out.println("Student course : "+ course);
		System.out.println("*****Student Data ends******");
	}

	public static void main(String[] args) {
		
//		Student[] studentArray = new Student[2];
//		Student s1 = new Student(11, "Sita", "DAC");
//		studentArray[0] = s1;
//		studentArray[0].printStudent();
//		
//		Student s2 = new Student(12, "Ram", "DAC");
//		studentArray[1] = s2;
//		studentArray[1].printStudent();
		
		//Create student array from user entered size
		System.out.println("please enter size of an array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		Student[] arr = new Student[size];
		for( int i = 0; i < arr.length; i++) {
			
			System.out.println("please enter student data as RNO, Name, course");
			Student s1 = new Student(scanner.nextInt(), scanner.next(), scanner.next());
			arr[i] = s1;
		}
		
		for( int i = 0; i < arr.length; i++) {
			arr[i].printStudent();
		}
		
		for( Student s : arr) {
			s.printStudent();
		}
		
		arr[500].printStudent();
		
		
		
		scanner.close();
	}

}
