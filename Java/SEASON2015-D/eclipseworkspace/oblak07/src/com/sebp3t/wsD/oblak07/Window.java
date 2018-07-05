package com.sebp3t.wsD.oblak07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

public class Window extends JFrame {
	
	public Object monitor;
	public MainPanel mp;
	public JPanel menuPanel;
	
	public JTextArea textArea;
	
	public int menuPanelHeight = 30;
	public String _TEXT_ = "";
	
	public Window() {
		super();
		
		monitor = new Object();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("oblak07 | Java Swing");
		this.setMinimumSize(new Dimension(400, 300));
		// --
		mp = new MainPanel();
		this.getContentPane().add(mp, BorderLayout.CENTER);
		mp.setLayout(null);
		
		menuPanel = new JPanel();
		mp.add(menuPanel);
		menuPanel.setBackground(Color.red);
		// for the first time, prefferedSize() then just Size() ...
		menuPanel.setBounds(0, 0, mp.getPreferredSize().width, menuPanelHeight);
		menuPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		menuPanel.add(panel, BorderLayout.WEST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnOpen = new JButton("Open");
		panel.add(btnOpen);
		btnOpen.addActionListener(new OpenButtonListener());
		
		JButton btnSave = new JButton("Save");
		panel.add(btnSave);
		btnSave.addActionListener(new SaveButtonListener());
		
		JLabel lblLocation = new JLabel("NO FILE OPENED");
		menuPanel.add(lblLocation, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setText(_TEXT_);
		textArea.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(192, 192, 192)));
		textArea.setFont(new Font("Arial", Font.BOLD, 30));
		textArea.setBounds(0, menuPanelHeight, mp.getPreferredSize().width, mp.getPreferredSize().height - menuPanelHeight);
		mp.add(textArea);
		
		// --
		this.pack();
		this.setLocationRelativeTo(null);
	}
}
