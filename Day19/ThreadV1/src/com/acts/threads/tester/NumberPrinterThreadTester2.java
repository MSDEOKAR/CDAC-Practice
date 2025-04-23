package com.acts.threads.tester;

import com.acts.threads.NumberPrinterRunnable;
import com.acts.threads.NumberPrinterThread;

public class NumberPrinterThreadTester2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		//Creating Thread objects
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + " started");
				try {
					for (int i = 0; i < 10; i++) {
						System.out.println(threadName + " Number: " + i);
						Thread.sleep(20);
					}
				} catch (InterruptedException e) {
					System.out.println(threadName +" exception: " + e.getMessage());
				}
				System.out.println(threadName + " Completed ");
				
			}
		});
		
		Thread t2 = new Thread( () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " started");
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println(threadName + " Number: " + i);
					Thread.sleep(20);
				}
			} catch (InterruptedException e) {
				System.out.println(threadName +" exception: " + e.getMessage());
			}
			System.out.println(threadName + " Completed ");
		});
		
		t1.start(); //Start method put thread in Runnable State from new state
		t2.start(); //Start method put thread in Runnable State from new state
		
		for(int i = 0; i < 10; i++) {
			System.out.println(" Number:" + i + " printed by "+ Thread.currentThread().getName());
			Thread.sleep(20);
		}
		t1.join();
		t2.join();
		System.out.println("Main completed");
	}

}
