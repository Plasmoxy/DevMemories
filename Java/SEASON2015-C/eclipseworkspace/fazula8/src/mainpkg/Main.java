package mainpkg;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Running class Main, psvm() on main thread; type q to exit ...");
		
		while (true) {
			System.out.print(">");
			String command = sc.nextLine();
			
			switch (command) {
			case "q":
				System.out.println("Exiting using System.exit(0), Bye !");
				System.exit(0);
				break;
			default :
				System.out.println("[ERROR] Unknown command.");
			}
			
		}
		
	}

}
