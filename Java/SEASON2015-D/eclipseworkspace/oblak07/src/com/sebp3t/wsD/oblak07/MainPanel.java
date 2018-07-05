package com.sebp3t.wsD.oblak07;

import java.awt.Dimension;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	public MainPanelComponentListener mpcl;
	
	public MainPanel() {
		super();
		this.setPreferredSize(new Dimension(1000, 600));
		mpcl = new MainPanelComponentListener();
		this.addComponentListener(mpcl);
	}

}
