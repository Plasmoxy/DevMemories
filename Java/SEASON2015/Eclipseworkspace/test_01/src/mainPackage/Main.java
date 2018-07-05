package mainPackage;

import firma.zamestnanci.PrebiracZemjakoch;

public class Main {
	
	public static PrebiracZemjakoch robotnik = new PrebiracZemjakoch();

	public static void main(String[] args) {
		
		robotnik.nahodneParametre();
		
		System.out.print("\n--robotnik--"
				+ "\npohlavie: " + robotnik.pohlavie
				+ "\nvek: " + robotnik.vek
				+ "\nmeno: " + robotnik.meno
				+ "\nrasa: " + robotnik.rasa);
		

	}

}
