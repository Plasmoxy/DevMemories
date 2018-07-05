package mainpackage;

public class Pracovnik extends Clovek {
	
	public String praca;
	
	public Pracovnik(String meno, int vek, String praca) {
		super(meno, vek);
		this.praca = praca;
	}
	
	@Override
	public void predstavSa() {
		super.predstavSa();
		System.out.println("Pracujem ako " + praca + " .");
	}

}
