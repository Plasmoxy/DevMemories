package mainPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Program extends JFrame{
	
	public Program()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MujProgram");
		this.setSize(320, 240);
	}
	
	public static Program program = new Program();
	public static NormalPanel panel1 = new NormalPanel();
	public static Graphics g;

	public static void main(String[] args) {
		
		program.setVisible(true);
		program.setResizable(false);
		program.add(panel1);
		program.setLocationRelativeTo(null);
		
	}
	
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
		g.create();
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, 100, 100);
	}

}
