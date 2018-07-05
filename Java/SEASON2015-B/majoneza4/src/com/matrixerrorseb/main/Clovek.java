package com.matrixerrorseb.main;

public class Clovek {
	
	public static int vek;
	public static String meno;
	
	public Clovek(String meno) {
		this.meno = meno;
	}
	
	public void pozdrav() {
		System.out.println("Cuus, ja som " + meno + ".");
	}

}
