package com.sebp3t.wsD.zaclona03.mainpkg;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Console extends Thread implements Runnable {
	
	private BlockingQueue<Boolean> exit_queue;
	private Scanner sc = new Scanner(System.in);
	
	public Console(BlockingQueue<Boolean> exit_queue) {
		this.exit_queue = exit_queue;
	}
	
	@Override
	public void run() {
		
		try {
			while (true) {
				
				String command = sc.nextLine();
				
				switch (command) {
				case "q" :
					exit_queue.put(true);
					System.out.println("sdasdd");
					break;
				}
				
				if (!(exit_queue.isEmpty())) {
					if (exit_queue.take()) break;
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
