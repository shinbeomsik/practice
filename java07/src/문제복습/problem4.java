package 문제복습;

import java.util.Random;

public class problem4 {

	public static void main(String[] args) {

		int[] jumsu = new int[10000];
		
		Random r = new Random(42);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}
		int min = jumsu[0];
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] < min) {
				min = jumsu[i];
			}//if
		}//for
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == min) {
				count++;
				System.out.print("jumsu[" + i + "]" + ",");
			}
		}
		
		System.out.println();
		System.out.println("최소값은 " + min);
		System.out.println(count);
	}

}
