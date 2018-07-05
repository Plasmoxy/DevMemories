package com.sebp3t.wsD.oblak07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sebp3t.wsD.oblak07.tools.SebFileManipulator;

public class SaveButtonListener implements ActionListener {
	
	public void actionPerformed(ActionEvent a_e) {
		
		synchronized (Main.w.monitor) {
			Main.w._TEXT_ = Main.w.textArea.getText().toString();
			try {
				SebFileManipulator.writeBFR("/home/seb/Desktop/cs", Main.w._TEXT_);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
