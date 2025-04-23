package com.acts.threads.tester;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.acts.threads.NumberPrinterRunnable;
import com.acts.threads.NumberSumCallable;

public class NumberPrinterExecutors1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		System.out.println(Thread.currentThread());

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {  
			NumberPrinterRunnable runnable = new NumberPrinterRunnable();
			executorService.execute(runnable);
		}  

		for (int i = 0; i < 5; i++) {  
			NumberSumCallable callable = new NumberSumCallable(1, 5);
			Future<Integer> sum = executorService.submit(callable);
			System.out.println("Sum = "+ sum.get());
		}  

		System.out.println("Main completed");
	}

}
