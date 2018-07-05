package com.sebp3t.wsD.oblak01;

import java.awt.Color;


public class Main {
	
	public static Window window;
	public static boolean stopLoop = false;
	public static Object monitor = new Object();

	public static void main(String[] args) {
		
		window = new Window();
		window.setVisible(true);
		
		new Thread() {
			@Override
			public void run() {
				while (true) {
					try { this.sleep(10); } catch (InterruptedException e) {e.printStackTrace();}
					synchronized (monitor) { window.mainPanel.setBackground(Color.red);}
					
					synchronized (monitor) { if (stopLoop) break; }
					
					try { this.sleep(10); } catch (InterruptedException e) {e.printStackTrace();}
					synchronized (monitor) { window.mainPanel.setBackground(Color.green);}
					
					synchronized (monitor) { if (stopLoop) break; }
				}
			}
		}.start();

	}

}
