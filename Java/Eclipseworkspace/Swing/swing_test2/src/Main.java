import java.io.IOException;

import javax.swing.*;

public class Main {

	
	
	public static void main(String[] args) throws IOException {
		
		Gui okno = new Gui();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		okno.setSize(300, 200);
		okno.setLocationRelativeTo(null);
		
		
		Runtime.getRuntime().exec("");

	}

}
