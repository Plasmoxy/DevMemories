package swing_testn1;
import javax.swing.*;

public class Window extends JFrame{
	
	public Window(int xSize, int ySize, String title) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(xSize, ySize);
	}

}
