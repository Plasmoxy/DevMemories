import java.util.Scanner;




public class Main {
	
	

	public static Scanner sc = new Scanner(System.in);
	public static String input;
	public static String exit = "exit";
	
	public static void main(String[] args) {
		
		while(true) {
		
		System.out.println("\nNapiste cislo od 0 do 3: ");
		input = sc.next();
		System.out.println("\n");
	    switch(input) {
	    case "0":
	    	System.out.println("NULA");
	    break;
	    case "1":
	    	System.out.println("JEDEN");
	    break;
	    case "2":
	    	System.out.println("DVA");
	    break;
	    case "3":
	    	System.out.println("TRI");
	    break;
	    default:
	    	System.out.println("#sh_ERROR : INVALID NUMBER");
	    break;
	    }
	    
		}

	}

}
