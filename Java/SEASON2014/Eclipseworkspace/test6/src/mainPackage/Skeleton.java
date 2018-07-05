package mainPackage;

import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Skeleton extends JFrame {
	
	public Surface surface = new Surface();
	
	public Skeleton() {
		initUI();
	}
	
	private void initUI() {
		super.setTitle("Java 2D example");
		super.add(surface);
		super.setSize(300, 200);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		
		Skeleton sk = new Skeleton();
		sk.setVisible(true);
		
		
	}

}
