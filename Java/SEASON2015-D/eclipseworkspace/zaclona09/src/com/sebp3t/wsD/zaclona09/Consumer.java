package com.sebp3t.wsD.zaclona09;

public class Consumer extends Thread {
	
private Object monitor;
	
	public Consumer(Object monitor) {
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
		
		while ( true ) {
			
			synchronized ( Main.producer ) {
				
				if ( !Main.producer.list.isEmpty() ) {
					System.out.println(Main.producer.list.get(0));
					Main.producer.list.remove(0);
				}
				
			}
			
		}
		
	}

}
