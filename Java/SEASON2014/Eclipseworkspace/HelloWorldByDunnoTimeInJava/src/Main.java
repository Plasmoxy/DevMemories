import java.io.IOException;


public class Main {
	

	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Papušek daco povi, ¾em co? Napiš co povi: ");
		Papusek.coPovi = Papusek.sc.next();
		System.out.print("\nPapušek hvari...");
		System.out.println("\nPapušek: " + Papusek.coPovi);
		System.out.println("\n\nPapušek je rad, bo hvari furt ¾em: " + Papusek.coPovi);
		for (int i = 0; i<11; i++)
		{
			System.out.println("Papušek: " + Papusek.coPovi);
		}

	}

}
