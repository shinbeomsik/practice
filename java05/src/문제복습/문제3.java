package 문제복습;

import javax.swing.JOptionPane;

public class 문제3 {

	public static void main(String[] args) {

		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < b.length; i++) {
			String data = JOptionPane.showInputDialog("비교군1 입력해주세요");
			a[i] = Integer.parseInt(data);
		}
		for (int i = 0; i < b.length; i++) {
			String data2 = JOptionPane.showInputDialog("비교군2 입력해주세요");
			b[i] = Integer.parseInt(data2);
		}
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x1 : b) {
			System.out.print(x1 + " ");
		}
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			if (a[i] > b[i]) {
				System.out.print("a ");
			} else if (a[i] < b[i]) {
				System.out.print("b ");

			} else {
				System.out.print("= ");
			}
		}
		System.out.println();
		int sum = 0;
		double aver = 0;
		for (int i = 0; i < b.length; i++) {
			sum = sum + a[i];
			aver = (double) sum / b.length;
		}
		System.out.println("a의 총합 :" + sum);
		System.out.println("a의 평균값 :" + aver);

		int sum2 = 0;
		double aver2 = 0;
		for (int i = 0; i < b.length; i++) {
			sum2 = sum2 + b[i];
			aver2 = (double) sum2 / b.length;
		}
		System.out.println("b의 총합 :" + sum2);
		System.out.println("b의 평균값 :" + aver2);

		if (sum > sum2) {
			System.out.println("a의 총합이 더큽니다.");
		} else if (sum < sum2) {
			System.out.println("b의 총합이 더 큽니다.");
		} else {
			System.out.println("총합이 동일합니다..");

		}
		if (aver > aver2) {
			System.out.println("a의 평균이 더큽니다.");
		} else if (aver < aver2) {
			System.out.println("b의 평균이 더 큽니다.");
		} else {
			System.out.println("평균이 동일합니다..");
			
		}

	}

}
