package 문제복습;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] jumsu = new int[10];
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("정수를 입력해주세요 >>");
			jumsu[i] = sc.nextInt();
		}
		
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		
		int min = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] < min) {
				min = jumsu[i];
			}//if
		}//for
		
		int max = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] > max) {
				max = jumsu[i];
			}//if
		}//for
		
		System.out.println();
		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
		
		sc.close();
	}

}
