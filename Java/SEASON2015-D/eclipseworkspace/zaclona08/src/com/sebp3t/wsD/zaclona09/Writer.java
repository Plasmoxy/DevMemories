package com.sebp3t.wsD.zaclona09;

public class Writer extends Thread {
	
	private Object monitor;
	
	public Writer(Object monitor) {
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i<=10; i++) {
			
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized ( monitor ) {
				System.out.println(i);
			}
		}
		
	}

}
