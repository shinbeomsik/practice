package 문제복습;

import java.util.Scanner;

public class 복습6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신이 좋아하는 과목은?");
		String data = sc.next();
		switch (data) {
		case "자바":
			System.out.println("JSP로 점프");
			break;
		case "파이썬":
			System.out.println("장고로 점프");
			break;

		default:
			System.out.println("무조건 열심히");
			break;
		}
	
	}

}
