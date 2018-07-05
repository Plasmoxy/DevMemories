package com.sebp3t.wsD.oblak03.mainpkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Cursor;

public class MainPanel extends JPanel {
	
	public int mp_width = 400;
	public int mp_height = 300;
	
	public MainPanel() {
		super();
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		this.setPreferredSize(new Dimension(mp_width, mp_height));
		this.setBackground(Color.blue);
		setLayout(new BorderLayout(0, 0));
		
		
		
	}
}
