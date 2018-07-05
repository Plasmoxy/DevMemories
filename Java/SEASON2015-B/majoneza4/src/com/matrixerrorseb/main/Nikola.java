package com.matrixerrorseb.main;

public class Nikola extends Clovek {
	
	public Nikola(String meno){
		super(meno);
	}
	
	@Override
	public void pozdrav() {
		super.pozdrav();
		System.out.println("Overrided");
	}

}
