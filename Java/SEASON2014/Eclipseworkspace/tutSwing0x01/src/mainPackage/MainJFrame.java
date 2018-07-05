package mainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainJFrame extends JFrame {

	public JPanel contentPane;
	public JTextField textField_meno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setTitle("Java Swing - Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HELLO WORLD !!!");
		lblNewLabel.setFont(new Font("Cracked Johnnie", Font.PLAIN, 15));
		lblNewLabel.setBounds(34, 4, 320, 24);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton btnPotvrdit = new JButton("Potvrdi\u0165");
		btnPotvrdit.setBounds(292, 35, 71, 30);
		contentPane.add(btnPotvrdit);
		
		textField_meno = new JTextField();
		textField_meno.setBounds(159, 37, 130, 26);
		contentPane.add(textField_meno);
		textField_meno.setColumns(10);
		
		JLabel JLabel_napistemeno = new JLabel("Nap\u00ED\u0161te svoje meno :");
		JLabel_napistemeno.setFont(new Font("PenultimateLightItal", Font.BOLD, 13));
		JLabel_napistemeno.setBounds(10, 39, 139, 21);
		contentPane.add(JLabel_napistemeno);
	}
}
