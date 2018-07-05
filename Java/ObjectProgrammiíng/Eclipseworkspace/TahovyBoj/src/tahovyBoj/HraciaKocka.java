package tahovyBoj;

import java.util.Random;

public class HraciaKocka {
	
	public int pocetStien;
	private Random random;
	
	public HraciaKocka(int constructor_pocetStien) {           //konstruktor class HraciaKocka
		this.pocetStien = constructor_pocetStien;
		random = new Random();
	}
	
	public int return_pocetStien() {
		return this.pocetStien;
	}
	
	public int hod() {
		return random.nextInt(this.pocetStien) + 1;
	}

}
