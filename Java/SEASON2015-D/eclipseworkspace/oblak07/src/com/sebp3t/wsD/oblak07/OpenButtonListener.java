package com.sebp3t.wsD.oblak07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import com.sebp3t.wsD.oblak07.tools.SebFileManipulator;

public class OpenButtonListener implements ActionListener {
	
	public void actionPerformed(ActionEvent a_e) {
		
		synchronized (Main.w.monitor) {
			try {
				Main.w._TEXT_ = SebFileManipulator.readBFR("/home/seb/Desktop/cs");
				Main.w.textArea.setText(Main.w._TEXT_);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
