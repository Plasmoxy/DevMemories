package tahovyBoj;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static HraciaKocka kocka = new HraciaKocka(10); //vytvori novu hraciu kocku (%kocka) so 6 hranami
	
	public static void main(String[] args) throws InterruptedException {
		
		Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kocka);
		
		System.out.printf("Bojovnik: %s\n", bojovnik.return_meno());
		System.out.printf("Nazive: %s\n", bojovnik.nazive());
		System.out.printf("Zivot: %s\n", bojovnik.grafickyZivot());
	}

}
