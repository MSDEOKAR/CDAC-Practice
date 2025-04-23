package com.acts.threads;

import java.util.concurrent.Callable;

public class NumberSumCallable implements Callable<Integer> {

	//Override call Method for logic
	@Override
	public Integer call() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started");
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		System.out.println(threadName + " Completed ");
		return sum;
	}
}
