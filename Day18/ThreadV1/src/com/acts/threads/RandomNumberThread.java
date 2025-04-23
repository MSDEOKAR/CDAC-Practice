package com.acts.threads;

public class RandomNumberThread extends Thread {

	public RandomNumberThread(String name) {
		super(name);
	}
	
	
	@Override
    public void run() {
		System.out.println(getName() + " running");
		System.out.println(Math.random());
		System.out.println("Run executed");
	}
}
