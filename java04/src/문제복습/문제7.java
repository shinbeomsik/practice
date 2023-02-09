package 문제복습;

import java.util.Random;
import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int count = 0;

		while (true) {
			System.out.print("내가 생각한 숫자는?");
			a = sc.nextInt();
			if (target == a) {
				System.out.println("정답입니다.");
				System.out.println("시도한 횟수는 " + count + "회입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				count++;
				if (target > a) {
					System.out.println("생각한 숫자보다 커요");
				} else {
					System.out.println("생각한 숫자보다 작아요");
				}

			}
		}

		sc.close();
	}

}
