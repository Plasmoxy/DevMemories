package com.matrixerrorseb.main;

public class Main {
	
	public static void main(String[] args) {
		
		Clovek a = new Pracovnik("Ter", 15, "zena", 0);
		Clovek b = new Pracovnik("Monika", 14, "zena", 0);
		Clovek c = new Clovek("Marek", 14, "muz");
		Clovek d = new Sef("Hozova", 301, "zena", 123123123, true);
		
		System.out.println(a.pozdrav());
		System.out.println(b.pozdrav());
		System.out.println(c.pozdrav());
		System.out.println(d.pozdrav());
		
	}

}
