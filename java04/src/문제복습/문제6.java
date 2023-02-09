package 문제복습;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("인기 투표 프로그램");
		System.out.println("=================");

		int a = 0;
		int b = 0;
		int c = 0;
		int data = 0;

		while (true) {

			System.out.print("1.아이유 , 2,뉴진스, 3,에스파 4.종료 >>");
			data = sc.nextInt();
			if (data == 4) {
				
				System.out.println("");
				System.out.println("투표를 종료하겠습니다.");
				System.out.println("===============");
				System.out.println("투표 결과는");
				System.out.println("아이유 " + a + "표");
				System.out.println("뉴진스" + b + "표");
				System.out.println("에스파 " + c + "표");
				break;
			}
			else if (data == 1) {
				a = a + 1;
			}else if (data == 2) {
				b = b + 1;
			}else {
				c = c + 1;
			}
		}
		sc.close();

	}

}
