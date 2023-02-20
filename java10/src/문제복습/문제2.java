package 문제복습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 문제2 {

	public static void main(String[] args) {
		
		HashSet programer = new HashSet();
		programer.add("디자이너");
		programer.add("프로그래머");
		programer.add("DB관리자");
		System.out.println(programer);
		
		LinkedList milk = new LinkedList();
		milk.add("어제 상한 우유");
		milk.add("오늘 싱싱한 우유");
		milk.add("내일 더 싱싱한 우유");
		
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		
		ski.remove(1);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 + "등 :" + ski.get(i));
		}
		
		HashMap call = new HashMap();
		call.put("1번", "엄마");
		call.put("2번", "아빠");
		call.put("3번", "친구");
		call.put("4번", "동생");
		
		System.out.println(call.get("2번"));
		
	}

}
