package com.sebp3t.wsD.zaclona02.mainpkg;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread implements Runnable {
	
private BlockingQueue<Integer> a_queue;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.a_queue = queue;
	}
	
	@Override
	public void run() {
		
		Integer a = 2;
		
		try {
			while (true) {
				a *= 2;
				a_queue.put(a);
				this.sleep(1000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
