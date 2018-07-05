package mainpkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class KresliaciPanel extends JPanel {
	
	public KresliaciPanel() {
		this.setPreferredSize(new Dimension(400, 300));
		this.setFont(new Font("Courier", Font.BOLD, 20));
		this.setBackground(Color.RED);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("AHOJ", 30, 30);
	}
	
}
