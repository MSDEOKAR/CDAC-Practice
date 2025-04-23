package com.acts.threads;

import java.util.concurrent.Callable;

public class NumberSumCallable implements Callable<Integer> {
	private int min;
	private int max;
	
	public NumberSumCallable(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	//Override call Method for logic
	@Override
	public Integer call() throws InterruptedException {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started");
		int sum = 0;
		for (int i = min; i < max; i++) {
			sum = sum + i;
			Thread.sleep(100);
		}
		//System.out.println(threadName + " Completed ");
		return sum;
	}
}
