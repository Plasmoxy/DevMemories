package sandbox0;

import java.text.DecimalFormat;

public class PointRotation {
	
	public static double[] rotate(double[] A, double theta) {
		
		// will make some trash but shouldnt be a problems
		
		double x = A[0];
		double y = A[1];
		double x_rot = x*Math.cos(theta) - y*Math.sin(theta);
		double y_rot = x*Math.sin(theta) + y*Math.cos(theta);
		
		double[] ret = {x_rot, y_rot};

		return ret;
		
	}
	
	public static void pointInfo(double[] A) {
		
		System.out.print("[ ");
		System.out.printf("%.12f", A[0]);
		System.out.print("  ");
		System.out.printf("%.12f", A[1]);
		System.out.println(" ]");
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		double[] A = {1,1};
		double[] B = rotate(A, Math.PI/4);
		
		pointInfo(B);
		
		
	}

}
