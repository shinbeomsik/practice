package 문제복습;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사과 구매 갯수");
		int apple = sc.nextInt();
		System.out.print("사과 한개당 가격");
		int count1 = sc.nextInt();

		System.out.print("딸기 구매 갯수");
		int st = sc.nextInt();

		System.out.print("딸기 한개당 가격");
		int count2 = sc.nextInt();
		
		int total = apple * count1;
		int total2 = st * count2;
		int total3 = total + total2;	
		
		System.out.println("==================");
		System.out.println("사과 구매 가격은 " +  total + "원 입니다.");
		System.out.println("딸기 구매 가격은 " +  total2 + "원 입니다.");
		System.out.println("전체 구매 가격은 " +  total3 + "원 입니다.");

		sc.close();

	}

}
