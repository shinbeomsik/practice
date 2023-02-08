package 문제복습;

import java.util.Scanner;

public class 복습5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("첫번째 정수");
		int a = sc.nextInt();
		System.out.print("두번째 정수");
		int b = sc.nextInt();
		
		
		System.out.println("========================");
		if (a > b) {
			System.out.println("첫번째 정수가 더 큽니다.");
		} else if (a < b) {
			System.out.println("두번째 정수가 더 큽니다.");
		} else {
			System.out.println("두수가 똑같습니다.");
		}
		

		
		sc.close();
	}

}
