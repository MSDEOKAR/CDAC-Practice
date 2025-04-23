package com.acts.threads.tester;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.acts.threads.NumberPrinterRunnable;
import com.acts.threads.NumberSumCallable;

public class NumberPrinterExecutors {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		System.out.println(Thread.currentThread());
		NumberSumCallable callable = new NumberSumCallable();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> sum = executorService.submit(callable);
		System.out.println("Sum = "+ sum.get());
		
		NumberPrinterRunnable runnable = new NumberPrinterRunnable();
		executorService.submit(runnable);
		
		
		System.out.println("Main completed");
	}

}
