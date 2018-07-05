package com.sebp3t.wsD.zaclona02.mainpkg;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
	
	private static BlockingQueue<Integer> a_queue = new ArrayBlockingQueue(10);

	public static void main(String[] args) {
		
		Producer producer = new Producer(a_queue);
		Consumer consumer = new Consumer(a_queue);
		
		producer.start();
		consumer.start();

	}

}
