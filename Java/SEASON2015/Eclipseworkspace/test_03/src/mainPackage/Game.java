package mainPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {
	
	public static boolean paintShit = false;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.red);
		if (paintShit) {
			g2d.drawLine(0, 0, 30, 30);
		}
		
		Toolkit.getDefaultToolkit().sync();
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("HASHTAG !");
		frame.add(new Game());
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addKeyListener(new KeyListener() {
		    public void keyPressed(KeyEvent e) {
		    	if (e.getKeyCode() == 10) {
		    		System.out.println("enter pressed");
		    		paintShit = true;
		    		repaint();
		    	}
		    }

		    public void keyReleased(KeyEvent e) { /* ... */ }

		    public void keyTyped(KeyEvent e) { /* ... */ }
		});
		
	}

}
 