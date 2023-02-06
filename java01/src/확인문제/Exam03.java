package 확인문제;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("통신사 입력");
		String data1 = JOptionPane.showInputDialog("전화번호 입력");
		String data2 = JOptionPane.showInputDialog("가입자 이름입력");
		
		String result = data2 + "님은" + data + "에" + data1 + "로 가입되셨습니다.";
		
		System.out.println(result);
		
		
	}

}
