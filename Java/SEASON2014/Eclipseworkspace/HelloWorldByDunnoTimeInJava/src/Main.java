import java.io.IOException;


public class Main {
	

	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Papu�ek daco povi, �em co? Napi� co povi: ");
		Papusek.coPovi = Papusek.sc.next();
		System.out.print("\nPapu�ek hvari...");
		System.out.println("\nPapu�ek: " + Papusek.coPovi);
		System.out.println("\n\nPapu�ek je rad, bo hvari furt �em: " + Papusek.coPovi);
		for (int i = 0; i<11; i++)
		{
			System.out.println("Papu�ek: " + Papusek.coPovi);
		}

	}

}
