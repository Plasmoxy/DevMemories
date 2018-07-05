package mainPackage;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class GameBoard extends JPanel implements ActionListener {

        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            
            
            Toolkit.getDefaultToolkit().sync();

        }

        public void actionPerformed(ActionEvent arg0) {

            repaint();
        }

 }