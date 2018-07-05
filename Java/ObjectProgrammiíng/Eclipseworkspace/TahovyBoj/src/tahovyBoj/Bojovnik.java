package tahovyBoj;

public class Bojovnik {
	
	private String meno;
	private int zivot;
	private int maxZivot;
	private int utok;
	private int obrana;
	private HraciaKocka kocka;
	
	public Bojovnik(String meno, int zivot, int utok, int obrana, HraciaKocka kocka) {
		
		this.meno = meno;
		this.zivot = zivot;
		this.maxZivot = zivot;
		this.utok = utok;
		this.obrana = obrana;
		this.kocka = kocka;
		
	}
	
	public String return_meno() {
		return this.meno;
	}
	
	public boolean nazive() {
		if (zivot > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String grafickyZivot() {
		String s = "[";
		int celkom = 20;
		double pocet = Math.round(((double)zivot / maxZivot) * celkom);
		if ((pocet == 0) && (nazive())) {
			pocet = 1;
		}
		for (int i = 0; i < pocet; i++) {
			s += "#";
		}
		for (int i = 0; i < celkom - pocet; i++) {
			s += " ";
		}
		s += "]";
		return s;
	}
	
	

}
