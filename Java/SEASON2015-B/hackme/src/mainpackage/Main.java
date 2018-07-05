package mainpackage;
import java.util.Scanner;

public class Main {
	
	public static Jabluko paper = new Jabluko();
	public static Scanner sc = new Scanner(System.in);
	public static int a = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		paper.fajne = true; //fajne jest jabluko mmmmmm
		
		while (true) {
			a = sc.nextInt();
			if (a == 420) {
				while (true) {
					System.out.println(a);
					Thread.sleep(1000);
				}
			} else {
				System.out.println(a);
			}
		}
		
	}

}
