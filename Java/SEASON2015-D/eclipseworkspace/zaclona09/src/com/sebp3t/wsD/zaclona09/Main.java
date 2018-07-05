package com.sebp3t.wsD.zaclona09;

import java.util.ArrayList;

public class Main {
	
	public static volatile Object monitor;
	
	public static Producer producer;
	public static Consumer consumer;

	public static void main(String[] args) {
		
		monitor = new Object();
		
		producer = new Producer(monitor);
		producer.start();
		consumer = new Consumer(monitor);
		consumer.start();
		

	}

}
