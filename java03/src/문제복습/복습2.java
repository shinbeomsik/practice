package 문제복습;

public class 복습2 {

	public static void main(String[] args) {
		
		int a = 0;
		for (int i = 33; i <= 222; i++) {
			a = a + i;
		}
		System.out.println(a);

		int b = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			b = b + i;
		}
		System.out.println(b);
		
		int c = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			c = c + i;
		}
		
		System.out.println(c);
		
		int d = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (i % 5 == 0) {
				continue;
			}
			d = d + i;
			 
		}
		System.out.println(d);
	}

}
