package com.matrixerrorseb.main;

import javax.swing.JFrame;

public class Okno extends JFrame {
	
	public Okno(String title) {
		Panel1 _Panel1 = new Panel1();
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(200, 200);
		this.setResizable(false);
		
		
		getContentPane().add(_Panel1);
		
	}
	
	public static void main(String[] args){
		
		Okno program = new Okno("chleb1");
		program.setVisible(true);
		
	}

}
