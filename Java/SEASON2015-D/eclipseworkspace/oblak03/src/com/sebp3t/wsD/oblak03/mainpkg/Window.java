package com.sebp3t.wsD.oblak03.mainpkg;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	public MainPanel mp;
	
	public Window() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("oblak03");
		mp = new MainPanel();
		this.add(mp);
		this.pack();
		this.setLocationRelativeTo(null);
		
	}

}
