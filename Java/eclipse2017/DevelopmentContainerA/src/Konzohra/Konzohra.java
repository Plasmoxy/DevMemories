package Konzohra;

import com.googlecode.lanterna.TerminalPosition;

public class Konzohra {
	
	public static void main(String[] args) throws InterruptedException {
		
		Board board = new Board();
		
		board.init();
		
		board.tgraphics.putString(new TerminalPosition(10,10), "hello");
		board.redraw();
		
		Thread.sleep(4000);
		
		board.destroy();
		
	}

}
