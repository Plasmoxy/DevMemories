package com.sebp3t.wsD.oblak02.mainpkg;

import java.awt.event.KeyEvent;

import com.sebp3t.wsD.oblak02.clib.Poehli_KeyActionListener;
import com.sebp3t.wsD.oblak02.clib.Poehli_KeyThread;

public class Player {
	
	public Object keyMonitor = new Object();
	public Poehli_KeyThread keyThread;
	public Poehli_KeyActionListener s_listener;
	public Thread s_ballMover;
	
	public Player() {
		
		s_ballMover = new Thread() {
			
			public boolean ballMoving = false;
			
			@Override
			public void run() {
				while (ballMoving) {
					synchronized (Main.window.game) {
						Main.window.game.moveBall(0, 3);
						try {
							this.sleep(10);
						} catch (InterruptedException e) {e.printStackTrace();}
					}
				}
			}
		};
		
		keyThread = new Poehli_KeyThread();
		s_listener = new Poehli_KeyActionListener(KeyEvent.VK_S) {
			
			public boolean ballMoving = false;

			@Override
			public void onKeyDown() {
				System.out.println("DOWN");
				synchronized (Main.class) {
					Main.window.game.moveBall(0, 1);
				}
			}
			@Override
			public void onKeyUp() {
				System.out.println("UP");
				synchronized (Main.class) {
					Main.window.game.moveBall(0, 1);
				}
			}
			@Override
			public void onKeyHolding() {
				
			}
			
		};
		
		keyThread.addKeyActionListener(s_listener);
		
		
		
	}

}
