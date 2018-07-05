package com.sebp3t.wsD.oblak07;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class MainPanelComponentListener implements ComponentListener {

	@Override
	public void componentResized(ComponentEvent e) {
		
		synchronized (Main.w.monitor) {
			Main.w.menuPanel.setBounds(0, 0, Main.w.mp.getSize().width, Main.w.menuPanelHeight);
			Main.w.textArea.setBounds(
					Main.w.textArea.getX(),
					Main.w.textArea.getY(),
					Main.w.mp.getSize().width,
					Main.w.mp.getSize().height - Main.w.menuPanelHeight
					);
		}
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
