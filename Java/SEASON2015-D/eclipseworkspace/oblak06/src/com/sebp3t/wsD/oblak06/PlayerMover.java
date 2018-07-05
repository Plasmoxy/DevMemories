package com.sebp3t.wsD.oblak06;

public class PlayerMover extends Thread {
	
	public Object monitor;
	
	public boolean moving_down, moving_up, moving_right, moving_left = false;
	
	public PlayerMover() {
		super();
		monitor = new Object();
	}
	
	@Override
	public void run() {
		
		while (true) {
			if (moving_down) {
				synchronized (Main.window.gp.monitor) {
					Main.window.gp.player_y += 1;
					Main.window.gp.repaint();
				}
			}
			if (moving_up) {
				synchronized (Main.window.gp.monitor) {
					Main.window.gp.player_y -= 1;
					Main.window.gp.repaint();
				}
			}
			if (moving_left) {
				synchronized (Main.window.gp.monitor) {
					Main.window.gp.player_x -= 1;
					Main.window.gp.repaint();
				}
			}
			if (moving_right) {
				synchronized (Main.window.gp.monitor) {
					Main.window.gp.player_x += 1;
					Main.window.gp.repaint();
				}
			}
			try {
				this.sleep(5);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}

}
