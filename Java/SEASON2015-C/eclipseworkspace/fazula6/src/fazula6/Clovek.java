package fazula6;

public class Clovek {
	
	public String meno;
	public int vek;
	public String partner;
	
	public Clovek(String meno, int vek, String partner) {
		this.meno = meno;
		this.vek = vek;
		this.partner = partner;
	}
	
	public String pozdrav() {
		return "Ahoj, ja som " + this.meno + ", mam " + String.valueOf(this.vek) + " rokov a moj partner sa vola " + this.partner + ".";
	}
	
	@Override
	public String toString() {
		return this.pozdrav();
	}

}
