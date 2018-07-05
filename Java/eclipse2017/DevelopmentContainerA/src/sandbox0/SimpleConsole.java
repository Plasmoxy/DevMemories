package sandbox0;

import java.util.Scanner;

public class SimpleConsole {
	
	public static Scanner sc;
	public static boolean exitState = false;
	public static String cmd;

	public static void main(String[] args) {
		
		System.out.println(" #### Simple Commandline example in Java #### ");
		
		sc = new Scanner(System.in);
		
		while (!exitState) {
			
			System.out.print("> ");
			
			cmd = sc.nextLine();
			
			switch (cmd) {
			case "":
				break;
			case "help":
				System.out.println (
						"Commands : \n"
						+ "	help - this text\n"
						+ "	hi - greeting\n"
						+ "	exit - exit console"
				);
				break;
			case "hi":
				System.out.println("Hello !");
				break;
			case "exit":
				System.out.println("####  Goodbye ! :) ####");
				exitState = true;
				break;
			default:
				System.out.println("Sorry, there is no command \""+cmd+"\".");
				break;
			
			}
			
		}
		
		
	}

}
