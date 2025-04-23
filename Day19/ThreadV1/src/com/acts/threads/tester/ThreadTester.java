package com.acts.threads.tester;

import com.acts.threads.RandomNumberThread;

public class ThreadTester {
	public static void main(String[] args) {
		RandomNumberThread numberThread = new RandomNumberThread("MyThread");
		//numberThread.start();
		RandomNumberThread numberThread1 = new RandomNumberThread("MyThread1");
		//numberThread1.start();
		RandomNumberThread numberThread2 = new RandomNumberThread("MyThread2");
		//numberThread2.start();
		RandomNumberThread numberThread3 = new RandomNumberThread("MyThread3");
		//numberThread3.start();
		RandomNumberThread numberThread4 = new RandomNumberThread("MyThread4");
		//numberThread4.start();
		RandomNumberThread numberThread5 = new RandomNumberThread("MyThread5");
		numberThread5.start();
		try {
			numberThread5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All Thread started");
	}
}
