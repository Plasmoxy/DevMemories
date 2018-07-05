package com.sebp3t.wsD.oblak01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	public JButton btn1;

	public MainPanel() {
		
		this.setPreferredSize(new Dimension(400, 300));
		this.setBackground(Color.green);
		setLayout(null);
		
		btn1 = new JButton("STOP");
		btn1.setBounds(138, 118, 117, 25);
		add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.stopLoop = true;
			}
		});

	}
}
