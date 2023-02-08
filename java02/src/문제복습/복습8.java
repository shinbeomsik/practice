package 문제복습;

import javax.swing.JOptionPane;

public class 복습8 {

	public static void main(String[] args) {
		
	String num1 = JOptionPane.showInputDialog("실수1");
	String num2 = JOptionPane.showInputDialog("실수2");
	
	double num11 = Double.parseDouble(num1);
	double num22 = Double.parseDouble(num2);
	
	String a = JOptionPane.showInputDialog("사칙연산자중 1개 선택");
	
	switch (a) {
	case "+":
		System.out.println(num11 + num22);
		break;
	case "-":
		System.out.println(num11 - num22);
		break;
	case "*":
		System.out.println(num11 * num22);
		break;
	case "/":
		System.out.println(num11 / num22);
		break;

	}
	
	
	}
	
}
