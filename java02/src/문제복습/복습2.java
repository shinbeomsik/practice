package 문제복습;

import javax.swing.JOptionPane;

public class 복습2 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		String age = JOptionPane.showInputDialog("당신의 나이는?");
		String data = JOptionPane.showInputDialog("당신의 소속은?");
		
		String result = name + "의 나이는  " + age + "세이고, 소속은 " + data +"에 속해있습니다.";
		
		System.out.println(result);

	}

}
