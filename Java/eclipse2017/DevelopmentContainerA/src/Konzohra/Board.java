package Konzohra;

import java.awt.Font;
import java.io.IOException;
import java.util.Arrays;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Board {
	
	
	// grid stuff
	private int WIDTH = 10; // columns
	private int HEIGHT = 10; // rows
	public char[][] grid;
	
	// lanterna stuff
	public Terminal terminal;
	public Screen screen;
	public TextGraphics tgraphics;
	
	
	// two constructors in case
	public Board() {
		grid = new char[HEIGHT][WIDTH];
	}
	public Board(int WIDTH, int HEIGHT) {
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		grid = new char[HEIGHT][WIDTH];
	}
	
	
	// better to use init so i can have more constructors
	public void init() {
		try {
			
			
			terminal = new DefaultTerminalFactory().createTerminal();
			
			screen = new TerminalScreen(terminal);
			tgraphics = screen.newTextGraphics();
			screen.setCursorPosition(null); // hide cursor
			
			screen.startScreen();
			
		} catch ( IOException e ) {
			System.out.println("Problem creating terminal.");
			e.printStackTrace();
		}
		
	}
	
	public void destroy() {
		
		try {
			
			screen.stopScreen();
			terminal.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clear() {
		
		for ( char[] row : grid ) {
			
			Arrays.fill(row, ' ');
			
		}
		
	}
	
	
	public void redraw() {
		try {
			screen.refresh();
		} catch(IOException e) {
			System.out.println("There was problem redrawing terminal.");
			e.printStackTrace();
			System.exit(-1);
		}
		
		
	}

}
