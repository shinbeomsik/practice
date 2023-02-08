package 문제복습;

import java.util.Scanner;

public class 복습7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은?>> ");
		String name = sc.next();
		
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
				
		System.out.print("키를 입력>> ");
		double cm = sc.nextDouble();
		
		System.out.print("저녁을 먹었나요? (true/false)");
		boolean b = sc.nextBoolean();
		
		System.out.print("올해의 목표는?>> ");
		sc.nextLine();
		String a = sc.nextLine();
		
		System.out.println("=================");
		System.out.println("제 이름은" + name + "입니다.");
		System.out.println("내년 나이는 " + (age + 1) + "세 입니다.");
		System.out.println("내년 키는 " + (cm + 10) + "cm 입니다.");
		if (b) {
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배가 고프시겠군요");
		}
		System.out.println("올해의 목표는" + a);
		

	}

}
