package dedenietest;

public class Petrik extends Clovek {
	
	public Petrik(String meno, int vek) {
		
		super(meno, vek);
		
	}
	
	
	@Override
	public void pozdrav() {
		
		super.pozdrav();
		System.out.println("A SOM PETRIK !!");
		
	}
	

}
