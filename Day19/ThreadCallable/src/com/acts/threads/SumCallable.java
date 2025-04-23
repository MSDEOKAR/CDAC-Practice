package com.acts.threads;

import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {

	//Override call method for logic
	@Override
	public Integer call() throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started");
		Integer sum  = 10;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		System.out.println(threadName + " Completed ");
		return sum;
	}
}
