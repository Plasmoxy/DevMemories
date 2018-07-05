package mainpackage;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String svalfile = SebFileManipulator.readBFR(args[0]);
		System.out.println(SVALCat.getValue(svalfile, args[1]));
		
	}

}
