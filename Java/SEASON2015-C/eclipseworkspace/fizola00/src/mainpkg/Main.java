package mainpkg;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Pocitac pct = new Pocitac("pct");
		pct.start();
		pct.join();
		System.out.println("DONE");
		
	}

}
