package matrixTest;

import org.ejml.simple.SimpleMatrix;

public class MatrixTest {
	
	public static void main(String[] args) {
		
		double[][] x = {
				{1,1,1},
				{1,2,3}
		};
		SimpleMatrix a = new SimpleMatrix(x);
		
		System.out.println(a.get(2, 3));
		
	}

}
