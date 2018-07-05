package com.sebp3t.wsD.zaclona05;

import com.sebp3t.wsD.zaclona05.tools.*;

public class Main {
	
	public static Object monitor = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		SebConsole console = new SebConsole(monitor);
		console.start();
		
		while (true) { // wait until console is done with init
			synchronized (monitor) { if (console.consoleInitDone) break; }
			Thread.sleep(10);
		}
		
		long a = 2;
		
		while (true) {
			synchronized (monitor) { if (console.exit) break; }
			
			a *= 2;
			
			if (a > -1) {
				System.out.println(a);
				Thread.sleep(100);
			} else {
				System.out.println("[Main] variable a reached negative value, System.exit(0); .");
				System.exit(0);
			}
		}
		
		System.out.println("[Main] Thread ending.");
		
	}

}
