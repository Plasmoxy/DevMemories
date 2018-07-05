package com.sebp3t.wsD.oblak00.mainpkg;

import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JLabel;

public class MovingLabel extends JLabel {
	
	public int currentX, currentY = 0;
	
	public MovingLabel(String text, int startX, int startY) {
		super(text);
		this.currentX = startX;
		this.currentY = startY;
		this.updateBounds();
	}
	
	public void updateBounds() {
		this.setBounds(new Rectangle(new Point(currentX, currentY), this.getPreferredSize()));
	}
	
	public void move(int plusX, int plusY) {
		this.currentX += plusX;
		this.currentY += plusY;
		this.updateBounds();
	}

}
