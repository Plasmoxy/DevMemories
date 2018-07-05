package com.matrixerrorseb.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSucet implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		long prveCislo = Integer.parseInt(Okno.cislo1Field.getText());
		long druheCislo = Integer.parseInt(Okno.cislo2Field.getText());
		long vysledok = prveCislo + druheCislo;
		Main.okno.vysledokLabel.setText(""+vysledok);
		
	}

}
