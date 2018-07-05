package mainpackage;

public class Clovek {
	
	public String meno;
	public String krstneMeno;
	public String priezvisko;
	public int vek;
	
	public Clovek(String meno, int vek) {
		this.meno = meno;
		this.vek = vek;
		this.krstneMeno = meno.split(" ")[0];
		this.priezvisko = meno.split(" ")[1];
	}
	
	public void predstavSa() {
		System.out.println(""
				+"Ahoj, volam sa " + this.meno
				+" a mam " + String.valueOf(this.vek)
				+" rokov."
				);
	}

}
