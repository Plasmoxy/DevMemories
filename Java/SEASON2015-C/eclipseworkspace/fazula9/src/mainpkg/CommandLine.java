package mainpkg;

import java.util.Scanner;

public class CommandLine extends Thread {
	
	public CommandLine(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Running class CommandLine extends Thread, run() on thread " + super.getName() +" ; type q to exit ...");
		
		while (true) {
			//System.out.print(">");
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
