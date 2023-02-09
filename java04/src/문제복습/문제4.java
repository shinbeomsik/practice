package 문제복습;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값 입력 ");
		int a = sc.nextInt();
		System.out.print("종료값 입력 ");
		int b = sc.nextInt();
		
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		sc.close();

	}

}
