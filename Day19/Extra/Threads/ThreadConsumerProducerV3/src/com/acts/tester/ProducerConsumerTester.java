package com.acts.tester;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

import com.acts.Message;
import com.acts.threads.Consumer;
import com.acts.threads.Producer;

public class ProducerConsumerTester {
	public static void main(String[] args) throws Exception {
		//Create Blocking queue
		BlockingQueue<Message> syncQueue = new SynchronousQueue<>();
		//Producer
		Producer producer = new Producer(syncQueue);
		Thread t1 = new Thread(producer, "PRODUCER");
		t1.start();
		
		//Consumer
		Consumer consumer = new Consumer(syncQueue);
		Thread t2 = new Thread(consumer, "CONSUMER");
		t2.start();
		
		System.out.println("Join Threads");
		t1.join();
		t2.join();
		System.out.println("Main Completed");
	}

}
