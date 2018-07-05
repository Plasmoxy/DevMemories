package mainPackage;

import javax.swing.JFrame;

public class Program extends JFrame {
	
	public static drawingPanel platno = new drawingPanel();
	
	public Program() {
		
		this.setTitle("Das drawer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(320, 240);
		
		this.add(platno);
		
		
	}

	public static void main(String[] args) {
		
		Program _Program = new Program();
		
		_Program.setVisible(true);
		
		platno.g.drawString("HELLO", 30, 30);

	}

}
