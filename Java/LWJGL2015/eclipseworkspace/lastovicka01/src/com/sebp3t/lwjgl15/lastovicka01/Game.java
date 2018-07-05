package com.sebp3t.lwjgl15.lastovicka01;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

 
public class Game {
	
	public static boolean EXIT = false;
	
	public static float[] playerCoords = {100F, 100F};
	public static float[] playerSize = {30F, 30F};
	public static float playerSpeed = 10F;
	public static boolean[] wasd = {false, false, false ,false};
	
    public void start() {
        try {
            //Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
            //Display.setTitle("lastovicka01 | LWJGL");
            Display.setFullscreen(true);
            Display.setVSyncEnabled(true);
            Mouse.setGrabbed(true);
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }
         
     // init OpenGL
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, 800, 0, 600, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        
        while (!EXIT) {
        	if (Display.isCloseRequested()) EXIT = true;
            
        	this.handleKeyboard();
        	
        	// Clear the screen and depth buffer
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);  
             
            // set the color of the quad (R,G,B,A)
            GL11.glColor3f(0.5f,0.5f,1.0f);
                 
            drawPlayer();
        	 
            Display.update();
            Display.sync(60);
        }
        
        Mouse.setGrabbed(false);
        
        System.out.println("[Game] Destroying");
         
        Display.destroy();
        
    }
    
    public void handleKeyboard() {
    	while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				switch (Keyboard.getEventKey()) {
				case Keyboard.KEY_ESCAPE:
					EXIT = true;
					break;
				case Keyboard.KEY_W:
					wasd[0] = true;
					break;
				case Keyboard.KEY_A:
					wasd[1] = true;
					break;
				case Keyboard.KEY_S:
					wasd[2] = true;
					break;
				case Keyboard.KEY_D:
					wasd[3] = true;
					break;
				}
			} else {
				switch (Keyboard.getEventKey()) {
				case Keyboard.KEY_W:
					wasd[0] = false;
					break;
				case Keyboard.KEY_A:
					wasd[1] = false;
					break;
				case Keyboard.KEY_S:
					wasd[2] = false;
					break;
				case Keyboard.KEY_D:
					wasd[3] = false;
					break;
				}
			}
		}
	}
    
    public void drawPlayer() {
    	if (wasd[0]) {
    		playerCoords[1] += playerSpeed;
    	} else if (wasd[1]) {
    		playerCoords[0] -= playerSpeed;
    	} else if (wasd[2]) {
    		playerCoords[1] -= playerSpeed;
    	} else if (wasd[3]) {
    		playerCoords[0] += playerSpeed;
    	}
    	// draw quad
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(playerCoords[0], playerCoords[1]);
        GL11.glVertex2f(playerCoords[0] + playerSize[0], playerCoords[1]);
        GL11.glVertex2f(playerCoords[0] + playerSize[0], playerCoords[1] + playerSize[1]);
        GL11.glVertex2f(playerCoords[0], playerCoords[1] + playerSize[1]);
        GL11.glEnd();
    }
    
}