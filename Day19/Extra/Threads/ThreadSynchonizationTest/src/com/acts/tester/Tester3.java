package com.acts.tester;

import java.io.IOException;

import com.acts.utils.TestMethods;

public class Tester3 {
	
	public static void main(String[] args) throws IOException,InterruptedException{
		// create SINGLE instance of SynchroUtils
		TestMethods util = new TestMethods();
		// Create 2 thrds using runnable : lambda expr , pass SAME instance to them ,
		// start them
	//Thread(Runnable instance , String name)
		Thread t1 = new Thread(() -> {
				util.method3();
		}, "t1");//t1 : NEW
		Thread t2 = new Thread(() -> {
				util.method4();
		}, "t2");//t2 : NEW
		t1.start();
		t2.start();//RUNABLE : 3
		System.out.println("Join threads");
		t1.join();
		t2.join();
		System.out.println("Main completed");

	}

}
