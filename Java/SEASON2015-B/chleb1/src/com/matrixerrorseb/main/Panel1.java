package com.matrixerrorseb.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panel1 extends JPanel {
	
	protected JLabel Label1 = new JLabel("Hello World");
	
	public Panel1(){
		this.add(Label1);
		Label1.setForeground(Color.GREEN);
	}

}
