package 문제복습;

public class problem5 {

	public static void main(String[] args) {
		String call = "     011-245-1234      ";
		String call1 = call.trim();
		
		String[] call2 = call1.split("-");
		
		for (String x : call2) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		
		if (call2[0].equals("011")) {
			System.out.println("SK");
		} else if (call2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		if (call2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int total = call2[0].length() + call2[1].length() + call2[2].length();
		
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않는 전화번호");
		}
		
	}

}
