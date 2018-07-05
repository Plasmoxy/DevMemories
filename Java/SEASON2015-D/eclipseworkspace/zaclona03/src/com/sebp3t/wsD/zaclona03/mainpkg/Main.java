package com.sebp3t.wsD.zaclona03.mainpkg;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
	
	private static BlockingQueue<Boolean> exit_queue = new ArrayBlockingQueue(10);
	
	public static void main(String[] args) throws InterruptedException {
		
		Console console = new Console(exit_queue);
		console.start();
		
		int a = 2;
		while (true) {
			exit_queue.
			a *= 2;
			System.out.println(a);
			Thread.sleep(1000);
		}
		
	}

}
