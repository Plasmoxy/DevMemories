package com.sebp3t.wsD.oblak06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
	
	public Object monitor;
	
	public int player_x = 30;
	public int player_y = 30;
	public boolean drawPlayer = true;
	
	public GraphicsPanel() {
		super();
		this.setPreferredSize(new Dimension(800, 400));
		monitor = new Object();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if (drawPlayer) f_drawPlayer(g2d);
		
	}
	
	public void f_drawPlayer(Graphics2D g2d) {
		g2d.setColor(Color.blue);
		g2d.fillOval(player_x, player_y, 20, 20);
		g2d.setColor(Color.black);
	}
	
}
