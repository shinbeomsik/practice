package 문제복습;

import javax.swing.JOptionPane;

public class 복습1 {

	public static void main(String[] args) {
		
		String data1 = JOptionPane.showInputDialog("정수 1");
		String data2 = JOptionPane.showInputDialog("정수 2");
		
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		
		int result = (data11 + data22);
		
		System.out.println(result);
		
	}

}
