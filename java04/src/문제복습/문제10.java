package 문제복습;

public class 문제10 {

	public static void main(String[] args) {
		int[] a = new int[200];
		a[0] = 1000;
		a[1] = 2000;
		a[2] = 3000;
		a[199] = 5000;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
		double[] b = new double[300];
		b[0] = 10.1;
		b[1] = 20.2;
		b[2] = 30.2;
		b[299] = 50.5;
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
