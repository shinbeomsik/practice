package 문제복습;

import javax.swing.JOptionPane;

public class 문제4 {

	public static void main(String[] args) {
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			String data = JOptionPane.showInputDialog("숫자를 입력해주세요");
			a[i] = Integer.parseInt(data);
		}
		for (int x : a) {
			System.out.print(x + " ");
		}
		int sum = 0;
		double aver = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			aver = (double) sum / a.length;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(aver);

		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 300) {
				sum2 = sum2 + a[i];
			}
		}
		System.out.println(sum2);
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 300) {
				System.out.print("a[" + i + "] ");
			}
		}

	}

}
