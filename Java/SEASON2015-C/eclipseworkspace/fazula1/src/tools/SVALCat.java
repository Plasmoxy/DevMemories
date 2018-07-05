// (c) Sebastian Petrik
package tools;

public class SVALCat {
	
	public static String getValue(String svalfile, String valuename) {
		String[] values_arr = svalfile.replace("\n", "").replace("\t", "").split(";");
		String returnVal = "";
		for (int i = 0; i < values_arr.length; i++) {
			String to_assign = values_arr[i];
			String[] assign = to_assign.split("=");
			if (assign.length == 2) {
				if (assign[0].equals(valuename)){
					returnVal = assign[1].replace("%n", "\n").replace("%t", "\t");
					break;
				}
			} else {
				System.out.println("[SVALCat:ERROR] Too much assignations");
			}
			
		}
		return returnVal;
	}

}