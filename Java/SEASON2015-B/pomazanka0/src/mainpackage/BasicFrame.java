package mainpackage;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class BasicFrame extends JFrame {
	
	protected int a;
	
	public BasicFrame() {
		super();
	}
	
	public void paint(Graphics g){
		
		if (this.a == 1){
			g.setColor(Color.green);
			g.drawLine(0, 0, 100, 100);
		}
		if (this.a == 2) {
			g.setColor(Color.MAGENTA);
			g.drawLine(100, 0, 0, 100);
		}
		
	    g.drawLine(10,10,150,150); // Draw a line from (10,10) to (150,150)
	}
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
	    BasicFrame frame = new BasicFrame();
	    
	    frame.setSize(200,200);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    while (true){
	    	frame.a = sc.nextInt();
		    frame.repaint();
	    }
	    
	}

}
