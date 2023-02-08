package 문제복습;

import javax.swing.JOptionPane;

public class 복습6 {

	public static void main(String[] args) {
		
	String num1 = JOptionPane.showInputDialog("정수1");
	String num2 = JOptionPane.showInputDialog("정수2");
	
	int num11 = Integer.parseInt(num1);
	int num22 = Integer.parseInt(num2);
	
	if (num11 > num22) {
		System.out.println(num11);
	} else if (num11 == num22) {
		System.out.println("두수가같음");
	} else {
		System.out.println(num22);
	}
	
	
	
		
	}
	
}
