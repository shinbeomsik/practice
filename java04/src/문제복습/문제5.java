package 문제복습;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작값입력>>");
		int start = sc.nextInt();
		System.out.print("종료값입력>>");
		int end = sc.nextInt();
		System.out.print("점프값입력>>");
		int jump = sc.nextInt();

		int sum = 0;
		for (int i = start; i <= end; i = i + jump) {
			sum = sum + i;
			if (sum >= 100) {
				System.exit(0);
			}
		}

		System.out.println(sum);
		sc.close();

	}

}
