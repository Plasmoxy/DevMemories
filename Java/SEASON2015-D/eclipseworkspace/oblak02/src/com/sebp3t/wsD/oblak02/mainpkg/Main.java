package com.sebp3t.wsD.oblak02.mainpkg;

public class Main {
	
	public static Window window;
	public static Object monitor = new Object();

	public static void main(String[] args) {
		
		window = new Window();
		window.setVisible(true);
		
		
		
		Player player = new Player();

	}

}
