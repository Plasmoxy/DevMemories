package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class drawingPanel extends JPanel {
	
	public static Graphics g;
	
	public drawingPanel() {
		
		this.setFont(new Font("Courier", Font.BOLD, 20));
		this.setBackground(Color.WHITE);
		
	}
	
	

}
