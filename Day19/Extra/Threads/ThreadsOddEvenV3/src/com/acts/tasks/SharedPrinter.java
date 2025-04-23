package com.acts.tasks;

public class SharedPrinter {
	boolean isOdd = true;

	synchronized void printEven(int number) {
		while(isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even:"+number);
		isOdd = true;
		notifyAll();
	}

	synchronized void printOdd(int number) {
		while(!isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd:"+number);
		isOdd = false;
		notifyAll();
	}
}
