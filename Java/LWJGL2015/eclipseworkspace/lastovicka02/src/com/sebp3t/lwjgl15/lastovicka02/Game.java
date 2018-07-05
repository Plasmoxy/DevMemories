package com.sebp3t.lwjgl15.lastovicka02;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;

public class Game {
	
	public boolean EXIT = false;
	public int GL_width = 1300;
	public int GL_height = 800;
	
	public Player player;
	public boolean[] wasd = {false, false, false, false};
	public List<Integer> keys = new ArrayList<Integer>();
	public Font awtFont = new Font("Times New Roman", Font.BOLD, 24);
	public TrueTypeFont font;
	
	public void start() {
		try {
			// -- INITIALIZATION --
			Display.setFullscreen(true); // enable fullscreen
			Display.create(); // create OpenGL display
			//Display.setVSyncEnabled(true);
			Mouse.setGrabbed(true); // hide mouse pointer
			// -- OpenGL INIT --
			initGL();
			// -- MISC INIT --
			font = new TrueTypeFont(awtFont, false);
			player = new Player(100F, 100F);
			player.setColor(0, 0, 255);
			// -- UPDATE --
			while (!EXIT) {
				EXIT = Display.isCloseRequested();
				handleInput();
				update();
				Display.update();
				Display.sync(60);
			}
			Display.destroy();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void initGL() {
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, GL_width, GL_height, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	
	public void update() {
		player.x = Mouse.getX();
		player.y = GL_height - Mouse.getY();
		
		
		
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT); // clear the screen
		
		GL11.glColor3f(1F, 0F, 0F);
		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f(100, 100);
			GL11.glVertex2f(200, 100);
			GL11.glVertex2f(200, 200);
			GL11.glVertex2d(100, 200);
		GL11.glEnd();
		
		player.draw();
	}
	
	public void handleInput() {
		// -- KEYBOARD --
		final int esc = Keyboard.KEY_ESCAPE;
		final int w = Keyboard.KEY_W;
		final int a = Keyboard.KEY_A;
		final int s = Keyboard.KEY_S;
		final int d = Keyboard.KEY_D;
		
		if (!keys.contains(esc) && Keyboard.isKeyDown(esc)) {
			//keys.add(esc);
			EXIT = true;
		}
		
		// -- MOUSE --
		if (Mouse.isButtonDown(0)) {
			if (player.x > 100F && player.x < 200F && player.y > 100F && player.y < 200F) EXIT = true;
		}
		if (Mouse.isButtonDown(1)) {
			System.out.println("X: " + player.x + " Y: " + player.y);
		}
		
	}

}
