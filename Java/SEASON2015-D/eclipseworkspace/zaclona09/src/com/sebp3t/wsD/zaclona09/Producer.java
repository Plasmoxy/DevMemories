package com.sebp3t.wsD.zaclona09;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Producer extends Thread {
	
	private Object monitor;
	private BigDecimal a;
	public volatile ArrayList list;
	
	public Producer(Object monitor) {
		this.monitor = monitor;
		this.list = new ArrayList();
		a = new BigDecimal(0);
	}
	
	@Override
	public void run() {
		
		while (true) {
			
			list.add(a);
			
			try {
				this.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			a = a.add(new BigDecimal(0.5));
			
		}
		
	}

}
