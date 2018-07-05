package mainPackage;

public class Main {
	
	public static Clovek sebo;

	public static void main(String[] args) {
		
		sebo.meno = "Sebastian";
		sebo.vek = 13;
		sebo.priezvisko = "Petrik";
		
		System.out.println(sebo.meno + " " + sebo.priezvisko + " ma " + Byte.toString(sebo.vek) + " rokov. ");

	}

}
