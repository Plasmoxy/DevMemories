package mainpkg;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Okno extends JFrame {
	
	public Okno() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		KresliaciPanel panel = new KresliaciPanel();
		this.add(panel);
		this.pack();
		
	}
	
	public static void main(String[] args) {
		
		Okno okno = new Okno();
		okno.setVisible(true);
		
	}
}
