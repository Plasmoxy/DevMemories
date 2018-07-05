package com.sebp3t.wsD.zaclona02.mainpkg;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread implements Runnable {
	
	private BlockingQueue<Integer> a_queue;
	
	public Consumer(BlockingQueue<Integer> a_queue) {
		this.a_queue = a_queue;
	}
	
	@Override
	public void run() {
		
		Integer a = 0;
		
		try {
			while (true) {
				a = a_queue.take();
				System.out.println(a);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
