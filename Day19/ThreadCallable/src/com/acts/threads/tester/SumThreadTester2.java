package com.acts.threads.tester;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import com.acts.threads.SumCallable;

public class SumThreadTester2 {

	public static void main(String[] args) throws Exception{

		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(() -> {System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());});
		service.execute(() ->  {System.out.println("How are you");
		System.out.println(Thread.currentThread().getName());});
		service.execute(() -> System.out.println("Bye"));

		service.submit(() -> {System.out.println("Submitted Task");
		System.out.println(Thread.currentThread().getName());});
	}
}
