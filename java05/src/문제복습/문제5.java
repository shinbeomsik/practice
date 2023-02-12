package 문제복습;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] place = new String[3];
		String[] place2 = new String[3];
		
		for (int i = 0; i < place2.length; i++) {
			  System.out.print("올해 가보고 싶은곳>>");
			place[i] = sc.next();
		}
		for (int i = 0; i < place2.length; i++) {
			System.out.print("내년에 가보고 싶은곳>>");
			place2[i] = sc.next();
		}
		int count = 0;
		for (int i = 0; i < place2.length; i++) {
			if (place[i].equals(place2[i])) {
				count++1;
			}
			
		}
			
		System.out.println("동일한 장소는" + count + "곳입니다.");
		
		
		sc.close();
	}

}
