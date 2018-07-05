package com.plasmoxy.atimer;

public class Main {
	
	public static int minutes = 60;
	
	public static void log(String txt) {
		System.out.println(txt);
	}
	
	public static void main(String[] args) {
		
		for ( int i = 1; i <= minutes; i++) {
		
			
			
			log("sleeping minute # " + String.valueOf(i));
			
			try {
				Thread.sleep(i * 60 * 1000);
			} catch(InterruptedException e) {
				
			}
			
			
		}
		
	}

}
