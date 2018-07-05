package lanterna02;

import java.io.IOException;
import java.util.Arrays;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.bundle.LanternaThemes;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;


public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println(LanternaThemes.getRegisteredThemes());
		
		// make terminal and screen
		
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		Screen screen = new TerminalScreen(terminal);
		screen.startScreen();

		// --------------
		
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(2));
		
		panel.addComponent(new Label("Forename"));
        panel.addComponent(new TextBox());

        panel.addComponent(new Label("Surname"));
        panel.addComponent(new TextBox());

        panel.addComponent(new EmptySpace(new TerminalSize(0,0))); // Empty space underneath labels
        panel.addComponent(new Button("Submit"));
		
		// --------------
		
		BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(
				Window.Hint.NO_DECORATIONS,
				Window.Hint.NO_POST_RENDERING,
				Window.Hint.CENTERED
				));
		
		
		
		window.setComponent(panel);
		
		// --------------
		
		MultiWindowTextGUI gui = new MultiWindowTextGUI(
				screen,
				new DefaultWindowManager(),
				new EmptySpace(TextColor.ANSI.BLACK)
				);
		
		gui.addWindowAndWait(window);
		
		// --------------

		screen.readInput();
		screen.stopScreen();
	}

}