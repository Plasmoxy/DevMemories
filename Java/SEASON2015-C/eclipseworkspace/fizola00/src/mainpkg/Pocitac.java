package mainpkg;

public class Pocitac extends Thread {
	
	public Pocitac(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		int a = 0;
		while (a < 2) {
			a++;
			System.out.println(a);
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		this.stop();
		
	}
	

}
