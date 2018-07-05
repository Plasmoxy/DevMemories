package com.sebp3t.wsD.oblak02.mainpkg;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	public Game game;
	
	public Window() {
		super();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("oblak02");
		
		game = new Game();
		this.add(game);
		
		this.pack();
		
		this.setLocationRelativeTo(null);
		
		this.setFocusable(true);
		
	}

}
