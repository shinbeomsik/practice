package 확인문제;

public class Exam08 {

	public static void main(String[] args) {
		int count = 5;
		int price = 5000;
		
		int result = count*price;
		
		if (result > 20000) {
			System.out.println("할인해드릴꼐요");
		} else {
			System.out.println("총 커피값을 내세요");
		}

		int age = 100;
		int age1 = age + 1;
		
		if (age1 > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어요");
		}
		
		int water = 1000;
		int count1 = 2;
		int mask = 2000;
		int count2 = 3;
		
		int price2 = water * count1;
		int price3 = mask * count2;
		int total = price2 + price3;
		
		
		System.out.println(price2);
		System.out.println(price3);
		System.out.println(total);
		
		int lan = 75;
		int math = 50;
		
		double total1 = lan + math;
		double total2 = total1/2;
		
		System.out.println(total2);
		
		}
	}


