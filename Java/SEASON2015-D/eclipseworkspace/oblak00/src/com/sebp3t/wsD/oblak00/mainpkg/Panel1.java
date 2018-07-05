package com.sebp3t.wsD.oblak00.mainpkg;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel1 extends JPanel {	

	public Panel1() {
		setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(400, 300));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(panel);
		panel.setLayout(null);
		
		final MovingLabel lbl1 = new MovingLabel("das Hund", 100, 100);
		panel.add(lbl1);
		
		final JButton btnA = new JButton("A");
		btnA.setBounds(12, 12, 117, 25);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.move(20, 20);
			}
		});
		panel.add(btnA);

	}
}
