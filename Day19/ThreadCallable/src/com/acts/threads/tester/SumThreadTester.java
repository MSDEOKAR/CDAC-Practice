package com.acts.threads.tester;

import java.util.concurrent.FutureTask;

import com.acts.threads.SumCallable;

public class SumThreadTester {

	public static void main(String[] args) throws Exception{
		System.out.println(Thread.currentThread().getName());
		SumCallable callable =  new SumCallable();

		FutureTask<Integer>[] sumTask = new FutureTask[5]; 
		for( int i = 0; i< 5; i++) {
			sumTask[i] = new FutureTask<Integer>(callable); 
			Thread t = new Thread(sumTask[i]); 
			t.start();
		}
		for( int i = 0; i< 5; i++) {
			Integer sum = sumTask[i].get();
			System.out.println(sum);
		}

		System.out.println("Main completed");
	}

}
