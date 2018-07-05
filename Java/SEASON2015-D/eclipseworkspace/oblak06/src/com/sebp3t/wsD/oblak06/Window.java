package com.sebp3t.wsD.oblak06;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	public JPanel mp = new JPanel();
	public JButton btn;
	public GraphicsPanel gp;
	
	public Window() {
		super();
		this.setTitle("oblak06 | Java Swing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//--
		gp = new GraphicsPanel();
		
		getContentPane().add(gp);
		gp.setLayout(null);
		
		//--
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
}
