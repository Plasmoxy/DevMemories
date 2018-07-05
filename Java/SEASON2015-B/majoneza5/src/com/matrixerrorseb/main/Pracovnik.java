package com.matrixerrorseb.main;

public class Pracovnik extends Clovek {
	
	protected int plat;
	
	public Pracovnik(String meno, int vek, String pohlavie, int plat){
		super(meno, vek, pohlavie);
		this.plat = plat;
	}
	
	@Override
	public String pozdrav(){
		return "Ahoj, ja som " + this.meno + ", mam " + String.valueOf(this.vek) + " rokov, som " + this.pohlavie + " a mam plat " + String.valueOf(this.plat) + " € na mesiac.";
	}

}
