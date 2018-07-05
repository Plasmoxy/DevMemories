package mainPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class Surface extends JPanel {
	
	public Graphics2D g2d;
	
	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Random random = new Random();
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}
	
	
	

}
