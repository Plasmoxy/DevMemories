package com.matrixerrorseb.main;

public class Sef extends Pracovnik {
	
	protected boolean glupy;
	private String pozdrav;
	private String ewry;
	private String slovencina_vasSef_pohlavie;
	
	public Sef(String meno, int vek, String pohlavie, int plat, boolean glupy){
		super(meno, vek, pohlavie, plat);
		this.glupy = glupy;
		
		if (this.pohlavie == "muz") slovencina_vasSef_pohlavie = "vas sef";
		if (this.pohlavie == "zena") slovencina_vasSef_pohlavie = "vasa sefka";
		
		if (this.glupy == true){
			pozdrav = "CUS KAKTUS ZIDANI";
			ewry = " EWRY (keby sce neznali ta GELD LOVE PENEZI DOPYSCISKA JAK NLC KAPECE NLC !!!) ";
		} else {
			pozdrav = "Dobry den";
			ewry = " eur ";
		}
	}
	
	@Override
	public String pozdrav(){
		return (
				pozdrav + ", ja som " + this.meno + " a som "
				+ slovencina_vasSef_pohlavie
				+ ", mam " + String.valueOf(this.vek)
				+ " rokov a mam plat " + String.valueOf(this.plat) + this.ewry
				+ "na mesiac."
		);
	}

}
