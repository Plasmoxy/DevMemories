package mainPackage;

public class Main {
	
	public static int vara = 123456;

	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println(vara);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
