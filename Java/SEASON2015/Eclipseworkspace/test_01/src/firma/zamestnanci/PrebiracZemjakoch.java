package firma.zamestnanci;

import java.util.Random;

public class PrebiracZemjakoch {
	public static String meno;
	public static int vek;
	public static String rasa;
	public static String pohlavie;

	public static void main(String[] args) {

		

	}
	
	public PrebiracZemjakoch() {
		
		
		
	}
	
	public void nahodneParametre() {
		Random rand = new Random();
		
		this.pohlavie = _param0.pohlavie[rand.nextInt(2)];
		switch (pohlavie) {
			case "zena":
				this.meno = _param0.menoZena[rand.nextInt(5)];
				break;
			case "muz":
				this.meno = _param0.menoMuz[rand.nextInt(5)];
		}
		
		this.rasa = _param0.rasa[rand.nextInt(5)];
		
		this.vek = rand.nextInt(100) + 1;
		
	}

}
