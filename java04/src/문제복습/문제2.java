package 문제복습;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ID를 입력해주세요 :");
		String id = sc.next();

		System.out.print("PW를 입력해주세요 :");
		String pw = sc.next();

		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}

		sc.close();
	}

}
