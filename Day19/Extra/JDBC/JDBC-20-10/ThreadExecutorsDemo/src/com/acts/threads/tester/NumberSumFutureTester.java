package com.acts.threads.tester;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.acts.threads.NumberSumCallable;

public class NumberSumFutureTester {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		System.out.println(Thread.currentThread());
		//Creating Thread objects
		NumberSumCallable callable = new NumberSumCallable(10, 20);
		FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
		futureTask.run();
		Integer sum = futureTask.get();
		System.out.println("Sum = "+ sum);
		System.out.println("Main completed");
	}

}
