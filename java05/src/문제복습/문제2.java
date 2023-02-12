package 문제복습;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자를 입력해주세요 :");
			a[i] = sc.nextInt();
		}

		System.out.println("=================");

		int sum = 0;
		double aver = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			aver = (double)sum/a.length;
		}
		System.out.println("숫자의 합은 :" + sum);
		System.out.println("숫자의 평균은 :" + aver);
		sc.close();

	}

}
