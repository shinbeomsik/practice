package 문제복습;

import java.util.HashMap;

public class 문제4 {
	public static void main(String[] args) {
		HashMap cs = new HashMap();
		
		cs.put("100번", "김데이");
		System.out.println(cs);
		cs.put("200번", "김사전");
		System.out.println(cs);
		cs.put("300번", "김구조");
		System.out.println(cs);
		cs.put("400번", "김자료");
		System.out.println(cs);
		cs.replace("200번", "탈퇴");
		cs.replace("300번", "김충성");
		System.out.println(cs);
		
	}
}