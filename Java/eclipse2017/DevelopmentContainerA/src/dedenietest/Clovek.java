package dedenietest;

public class Clovek {
	
	public int vek;
	public String meno;
	
	public Clovek(String meno, int vek) {
		
		this.vek = vek;
		this.meno = meno;
		
	}
	
	public void pozdrav() {
		
		System.out.println("Ahoj, ja som " + meno + " a mám " + String.valueOf(vek) + " rokov.");
		
	}

}
