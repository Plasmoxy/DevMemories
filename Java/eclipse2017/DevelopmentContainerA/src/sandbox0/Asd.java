package sandbox0;

import exceptiontest.SampleException;

public class Asd {
	
	public static void main(String[] args) {
		
		try {
			throw new SampleException();
			
		} catch(SampleException e) {
			
			System.out.println(e.toString());
			
		} catch(Exception e) {
			
			System.out.println("rr");
			
		}
		
	}

}
