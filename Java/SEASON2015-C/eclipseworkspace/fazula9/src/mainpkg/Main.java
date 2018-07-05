package mainpkg;

public class Main {
	
	public static void main(String[] args) {
		
		CommandLine cmd = new CommandLine("cmd");
		cmd.setPriority(6);
		cmd.start();
		
		Revac ua = new Revac("ua");
		ua.start();
		
	}

}
