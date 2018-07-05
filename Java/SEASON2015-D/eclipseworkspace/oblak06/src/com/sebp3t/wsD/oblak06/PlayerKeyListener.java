package com.sebp3t.wsD.oblak06;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerKeyListener implements KeyListener {
	
	private boolean w, a, s, d = false;

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W :
			if (!w) {
				w = true;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_up = true;
				}
			}
			break;
		case KeyEvent.VK_A :
			if (!a) {
				a = true;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_left = true;
				}
			}
			break;
		case KeyEvent.VK_S :
			if (!s) {
				s = true;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_down = true;
				}
			}
			break;
		case KeyEvent.VK_D :
			if (!d) {
				d = true;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_right = true;
				}
			}
			break;
		default :
			// do nothing if unbinded key
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W :
			if (w) {
				w = false;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_up = false;
				}
			}
			break;
		case KeyEvent.VK_A :
			if (a) {
				a = false;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_left = false;
				}
			}
			break;
		case KeyEvent.VK_S :
			if (s) {
				s = false;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_down = false;
				}
			}
			break;
		case KeyEvent.VK_D :
			if (d) {
				d = false;
				synchronized (Main.playerMover.monitor) {
					Main.playerMover.moving_right = false;
				}
			}
			break;
		default :
			// do nothing if unbinded key
			break;
		}
	}
	
	

}
