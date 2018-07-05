package com.sebp3t.wsD.oblak01;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	public static MainPanel mainPanel;
	
	public Window() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("oblak01");
		
		mainPanel = new MainPanel();
		this.add(mainPanel);
		
		this.pack();
		
		this.setLocationRelativeTo(null);
		
	}

}
