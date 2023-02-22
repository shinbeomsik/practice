package 문제복습;

import java.util.ArrayList;

public class 문제1 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		
		System.out.println(me);
		System.out.println((int)me.get(0) + 1000);
		System.out.println((double)me.get(1) + 10); 
		
		if ((boolean)me.get(2)) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		if ((char)me.get(3) == '남') {
			System.out.println("주민번호는 1,3 이에요");
		} else {
			System.out.println("주민번호는 2,4 이에요");

		}
			
	}

}
