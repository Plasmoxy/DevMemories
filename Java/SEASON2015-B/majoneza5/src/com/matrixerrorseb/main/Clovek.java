package com.matrixerrorseb.main;

public class Clovek {
	
	protected String meno;
	protected int vek;
	protected String pohlavie;
	
	public Clovek(String meno, int vek, String pohlavie){
		this.meno = meno;
		this.vek = vek;
		this.pohlavie = pohlavie;
		
		if ( !(this.pohlavie == "muz" || this.pohlavie == "zena") ) {
			System.out.println("[Custom] [Chyba] : TAKE POHLAVIE NEEXISTUJE U DRUHU HOMO SAPIENS SAPIENS !!!");
		}
	}
	
	public String pozdrav(){
		return "Ahoj, ja som " + this.meno + ", mam " + String.valueOf(this.vek) + " rokov a som " + this.pohlavie + ".";
	}

}
