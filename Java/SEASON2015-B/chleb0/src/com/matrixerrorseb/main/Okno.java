package com.matrixerrorseb.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Okno extends JFrame {
	
	public static JLabel vysledokLabel = new JLabel("0");
	public static JButton sucetButton = new JButton("Scitaj");
	public static JTextField cislo1Field = new JTextField("", 20);
	public static JTextField cislo2Field = new JTextField("", 20);
	public static JPanel panel1 = new JPanel();
	public static JPanel panel2 = new JPanel();
	public static EventSucet sucet = new EventSucet();
	
	public Okno(String title) {
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setTitle(title);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setPreferredSize(new Dimension(100, 100));
		
		FlowLayout layout = new FlowLayout();
		super.setLayout(layout);
		
		super.add(panel1);
		panel1.setBackground(Color.red);
		super.add(panel2);
		panel2.setBackground(Color.green);
		
		panel1.add(cislo1Field);
		panel1.add(cislo2Field);
		panel1.add(sucetButton);
		panel2.add(vysledokLabel);
		
		sucetButton.addActionListener(sucet);
	
	}

}
