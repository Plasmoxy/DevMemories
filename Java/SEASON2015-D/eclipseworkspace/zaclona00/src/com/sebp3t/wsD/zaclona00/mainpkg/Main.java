package com.sebp3t.wsD.zaclona00.mainpkg;

public class Main {
	
	public boolean exit = false;
	public Object monitor = new Object();

	public static void main(String[] args) {
		
		Console console = new Console();
		console.run();
		
		
		int a = 2;
		while (true) {
			a *= 2;
			System.out.println(a);
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			synchronized (monitor) {
				if (exit) {
					break;
				}
			}
		}

	}

}
