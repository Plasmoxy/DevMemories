package mainPackage;

public class Main {
	
	public static Clovek janos = new Clovek();

	public static void main(String[] args) {
		
		janos.meno = "Ján";
		janos.priezvisko = "Petrík";
		janos.vek = 40;
		janos.iq = 150;
		janos.vyska = 200;
		
		
		System.out.printf(
				"Clovek janos sa vola %s %s."
				+ "\nMa %d rokov."
				+ "\nJeho vyska je %d %s."
				+ "\nJeho IQ je %d.",
				janos.meno, janos.priezvisko, janos.vek, janos.vyska, janos.vyska_unit_shortcut_INTERNATIONAL, janos.iq
		);

	}

}
