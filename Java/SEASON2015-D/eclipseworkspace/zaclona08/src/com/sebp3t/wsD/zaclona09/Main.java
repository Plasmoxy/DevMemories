package com.sebp3t.wsD.zaclona09;

public class Main {
	
	public static volatile Object monitor;
	
	public static void main(String[] args) {
		
		monitor = new Object();
		
		Writer w1 = new Writer(monitor);
		Writer w2 = new Writer(monitor);
		
		w1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		w2.start();
		
	}

}
