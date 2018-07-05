package lanternatesting;

import java.io.IOException;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
public class Lanterna0 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Terminal term = new DefaultTerminalFactory().createTerminal();
		Screen scr = new TerminalScreen(term);
		TextGraphics tg = scr.newTextGraphics();
		
		scr.startScreen();
		scr.setCursorPosition(null); // hide cursor
		
		tg.drawLine(0, 0, 10, 10, 'X');
		scr.refresh();
		Thread.sleep(1000);
		
		scr.setCharacter(new TerminalPosition(5,5), new TextCharacter('R'));
		scr.refresh();
		Thread.sleep(10000);
		
		scr.stopScreen();
		
	}

}
