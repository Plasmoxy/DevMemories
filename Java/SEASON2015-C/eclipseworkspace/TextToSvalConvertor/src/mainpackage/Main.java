package mainpackage;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String file = SebFileManipulator.readBFR(args[0]);
		file = file.replace("\n", "%n\n").replace("\t", "%t");
		String svalParams = "%=SVAL\n%useDecompiler=SVALCat\n\n";
		SebFileManipulator.writeBFR(args[0], svalParams + args[1] + "=" + file + ";");
		
	}

}
