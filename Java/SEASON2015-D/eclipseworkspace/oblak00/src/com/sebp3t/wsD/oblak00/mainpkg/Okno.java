package com.sebp3t.wsD.oblak00.mainpkg;

import javax.swing.JFrame;

public class Okno extends JFrame {
	
	public static Panel1 panel = new Panel1();
	
	public Okno() {
		
		super();
		
		this.setTitle("asd");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		
		this.add(panel);
		
		this.pack();
		
		
	}

}
