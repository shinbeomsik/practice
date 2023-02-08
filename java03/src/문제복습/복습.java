package 문제복습;

import javax.swing.JOptionPane;

public class 복습 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기가수를 투표해주세요. (1.뉴진스 2.에스파 3.아이유)");
			
			if (data.equals("1")) {
				a = a + 1;
			} else if (data.equals("2")) {
				b = b + 1;
			} else if (data.equals("3")) {
				c = c + 1;
			} else{
				JOptionPane.showMessageDialog(null, "1.2.3번중에 1개를 선택해주세요");
			}
		}
		System.out.println("오늘의 인기가수는???");
		System.out.println("뉴진스 :" + a + "표를 받았습니다.");
		System.out.println("에스파 :" + b + "표를 받았습니다.");
		System.out.println("아이유 :2" + c + "표를 받았습니다.");
		
	}

}
