package com.sebp3t.wsD.zaclona00.mainpkg;

import java.util.Scanner;

public class Console extends Thread implements Runnable {
	
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		
		System.out.println("[Console] Console running on class Console, Thread " + super.getName() + " .");
		System.out.println("[Console] Type 'h' for help.");
		
		while (true) {
			
			String command = sc.nextLine();
			
			switch (command) {
			case "h" :
				System.out.println("[Console] Console service, commnads ...");
				System.out.println("[Console] h - display this help");
				System.out.println("[Console] q - broadcast exit command to all threads");
				break;
			case "q" :
				synchronized(Main.monitor) {
					Main.exit = true;
				}
				break;
			default :
				System.out.println("[Console] Unknown commnad.");
				break;
			}
			
			synchronized(Main.monitor) {
				if (Main.exit) {
					System.out.println("[Console] caught exit broadcast, finalizing");
					try {
						super.finalize();
					} catch (Throwable e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}
		
		
		
		
	}

}
           