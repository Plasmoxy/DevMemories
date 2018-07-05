package com.sebp3t.lwjgl15.lastovicka02;

import org.lwjgl.opengl.GL11;

public class Player {
	
	public float x;
	public float y;
	public float width = 4F;
	public float height = 4F;
	public byte color_rgb[] = {0, 0, 0};
	
	public Player(float startX, float startY) {
		this.x = startX;
		this.y = startY;
	}
	
	public void draw() {
		GL11.glColor3ub(color_rgb[0], color_rgb[1], color_rgb[2]);
		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f(x - width/2, y - height/2);
			GL11.glVertex2f(x - width/2 + width, y - height/2);
			GL11.glVertex2f(x - width/2 + width, y - height/2 + height);
			GL11.glVertex2f(x - width/2, y - height/2 + height);
		GL11.glEnd();
	}
	
	public void setColor(int red, int green, int blue) {
		this.color_rgb[0] = (byte) red;
		this.color_rgb[1] = (byte) green;
		this.color_rgb[2] = (byte) blue;
	}

}
