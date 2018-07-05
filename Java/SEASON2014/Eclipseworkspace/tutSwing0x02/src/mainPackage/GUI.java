package mainPackage;

import javax.swing.*;

public class GUI extends JFrame{
	
	public GUI()
	{
		this.setTitle("Okno programu");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 300);
		
		Panel1 panelak = new Panel1();
		this.add(panelak);
	}
	
	public static GUI okno = new GUI();
	
	
	public static void main(String[] args)
	{
		okno.setVisible(true);
		
	}

}
