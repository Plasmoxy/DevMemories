package localObjekt;

public class LocalObjekt {
	
	private int x = 0;
	
	public LocalObjekt(int x) {
		
		this.x = x;
		
	}
	
	public int get_x() {
		return this.x;
	}
	
	
	public static void main(String[] args) {
		
		LocalObjekt A = new LocalObjekt(4);
		
		System.out.println(A.x);
		
	}

}
