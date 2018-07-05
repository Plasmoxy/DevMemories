package com.sebp3t.wsD.oblak02.mainpkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Game extends JPanel {
	
	public int ball_x = 0;
	public int ball_y = 0;
	public int ball_width = 30;
	public int ball_height = 30;
	
	public Game() {
		super();
		this.setPreferredSize(new Dimension(400, 300));
	}
	
	public void moveBall(int plus_x, int plus_y) {
		this.ball_x += plus_x;
		this.ball_y += plus_y;
	}
	
	public void paintBall(Graphics2D g2d) {
		g2d.fillOval(ball_x, ball_y, ball_width, ball_height);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.green);
		g2d.fillRect(100, 100, 100, 100);
		g2d.setColor(Color.red);
		paintBall(g2d);
	}

}
