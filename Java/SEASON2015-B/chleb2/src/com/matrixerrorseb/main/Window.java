package com.matrixerrorseb.main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JButton;

public class Window extends JFrame {
	
	public Window(String title){
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(200, 200); //now the WindowBuilder ...
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension(this.getWidth(), 85));
		panel.setBackground(Color.red);
		
		JPanel panel2 = new JPanel();
		getContentPane().add(panel2, BorderLayout.SOUTH);
		panel2.setPreferredSize(new Dimension(this.getWidth(), 85));
		panel2.setBackground(Color.green);
		
		JButton btnBujon = new JButton("bujon");
		panel2.add(btnBujon);
		
	}
	
	public static void main(String[] args) {
		
		Window program = new Window("chleb2");
		program.setVisible(true);
		
	}

}
