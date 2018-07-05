package lanterna03;

import java.io.IOException;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Main {
	
	public static Terminal term;
	public static Screen scr;
	public static TextGraphics tg;
	
	// critical value here {
	public static int loadingSegments = 30;
	public static int[] CLR_A = {255, 0, 255};
	public static int[] CLR_B = {0, 255, 191};
	// }
	
	public static TerminalPosition tpos(int x, int y) {
		
		return new TerminalPosition(x, y);
		
	}
	
	public static int map(int x, int in_min, int in_max, int out_min, int out_max) // trojælenka xd
	{
	  return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
	}
	
	public static String getLoadingString(int lSegments, int percentage) {
		
		int charamt = (int)( (float)lSegments * ((float)percentage/100) );
		
		String s = "";
		for ( int i = 1; i <= charamt; i++) {
			s += "#";
		}
		return s;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		term = new DefaultTerminalFactory().createTerminal();
		scr = new TerminalScreen(term);
		tg = scr.newTextGraphics();
		
		
		
		scr.startScreen();
		scr.clear();
		
		/* --- */
		
		tg.putString( tpos(0, 0), "Press any key to start counting to 10");
		scr.refresh();
		scr.readInput();
		scr.clear();
		
		/* --- */
		
		tg.setForegroundColor(TextColor.ANSI.BLACK);
		tg.setBackgroundColor(
				new TextColor.RGB(
					CLR_A[0], CLR_A[1], CLR_A[2]
				)
		); // the color of bg at the beggining is CLR_A
		tg.fillRectangle( tpos(0, 0), term.getTerminalSize(), ' ');
		
		
		
		int[] loadingPosition = {
				term.getTerminalSize().getColumns()/2 - loadingSegments/2 - 2,
				term.getTerminalSize().getRows()/2
		};
		
		
		
		for ( int i = 1; i <= 100; i++) { // btw in current state i is the current percentage
			
			// update the colors of bg
			
			tg.setBackgroundColor(new TextColor.RGB(
					map(i, 0, 100, CLR_A[0], CLR_B[0]),
					map(i, 0, 100, CLR_A[1], CLR_B[1]),
					map(i, 0, 100, CLR_A[2], CLR_B[2])
			));
			
			// fill full window bg with current color
			tg.fillRectangle( tpos(0, 0), term.getTerminalSize(), ' ');
			
			// this strings will be rewritten by window bg each frame, therefore we need them in loop
			// (and also we need them to be after window bg fullfill )
			String greetings = "COUNTING in interval <0, 10> BLYAT";
			tg.putString(
					tpos(
						term.getTerminalSize().getColumns()/2 - greetings.length()/2,
						loadingPosition[1] - 4
					),
					greetings
			);
						
			
			tg.setCharacter(
					tpos( loadingPosition[0], loadingPosition[1]),
					'['
			);
			tg.setCharacter(
					tpos( loadingPosition[0]+loadingSegments+1, loadingPosition[1]),
					']'
			);
			
			// update the progress bar
			
			tg.putString(
					tpos(
						term.getTerminalSize().getColumns()/2 - 2,
						loadingPosition[1]-1
					),
					Integer.toString(i) + "%"
			);
			tg.putString(
					tpos(loadingPosition[0]+1,  loadingPosition[1]),
					getLoadingString(loadingSegments, i)
			);
			
			
			
			// refresh and complete step
			
			scr.refresh();
			
			Thread.sleep(100);
		}
		
		String done = "DONE COUNTING CYKA ( press anykey to R.I.P. )";
		tg.putString(
				tpos(
					term.getTerminalSize().getColumns()/2 - done.length()/2,
					loadingPosition[1] + 4
				),
				done
		);
		
		/* --- */
		
		tg.setBackgroundColor(TextColor.ANSI.GREEN);
		scr.refresh();
		
		scr.readInput();
		scr.stopScreen();
		
		
		
		
		
	}

}
