package com.sebp3t.wsD.oblak06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
	
	public static Object monitor = new Object();
	public static Window window;
	public static PlayerMover playerMover;
	
	public static boolean s_pressed = false;
	
	public static void main(String[] args) {
		window = new Window();
		window.setVisible(true);
		window.setFocusable(true);
		
		window.addKeyListener(new PlayerKeyListener());
		
		playerMover = new PlayerMover();
		playerMover.start();
		
	}

}
