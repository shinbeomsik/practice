package 문제복습;

public class 계산기 {

	public static void main(String[] args) {
		
		        계산기반환값 cal = new 계산기반환값();
		        
		        int price = 7000;
		        int count1 = 5; //오전에 온 손님수
		        int count2 = 4; //후에 온 손님수
		        
		        //1. 전체 손님 수를 반환받아서 다음과 같이 프린트
				//   오늘 온 손님의 총 합은 9명입니다.
		        int result1 = cal.add(count1, count2);
		        System.out.println(result1);
				
		        //2. 오전과 오후 손님수 차이는? 다음과 같이 프린트
				//   손님 수 차이는 1명입니다. 
		        int result2 = cal.minus(count1, count2);
		        System.out.println(Math.abs(result2));
		        
				//3. 오전에 들어온 손님의 결제 금액은? 다음과 같이 프린트
				//   오전 결제금액은 35000원입니다.
		        int result3 = cal.mul(price,count1);
		        System.out.println(result3);
		        
				//4. 오후에 들어온 손님의 결제 금액은? 다음과 같이 프린트
				//   오후 결제금액은 28000원입니다.
		        int result4 = cal.mul(price, count2);
		        System.out.println(result4);
		        
				//5. 오전과 오후에 들어온 손님의 총 결제금액은? 다음과 같이 프린트
				//   오늘 하루 총 결제금액은 63000원입니다.
		        int result5 = cal.add(result3, result4);
		        System.out.println(result5);
		        
				//6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산해주세요. 다음과 같이 프린트
				//   1인당 결제금액은 7000원입니다.
		        int result6 = cal.div(result5, result1);
		        System.out.println(result6);
		
	}

}
