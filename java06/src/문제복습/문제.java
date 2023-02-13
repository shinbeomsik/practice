package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 문제 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(480, 900);
		f.setTitle("극장예매화면");
		f.getContentPane().setBackground(Color.DARK_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("고딕", 1, 20);
		Font font1 = new Font("d2coding", 1, 40);

		JLabel result = new JLabel();
		result.setText("결과 보이는곳");
		result.setFont(font1);

		JButton[] btn = new JButton[100];
		int[] seat = new int[btn.length];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);

			f.add(btn[i]);

			if (i < 30) {
				btn[i].setBackground(Color.orange);
			} else if (30 <= i && i < 72) {
				btn[i].setBackground(Color.pink);
			} else {
				btn[i].setBackground(Color.yellow);
			}

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					String text = e.getActionCommand();
					int no = Integer.parseInt(text);

					if (seat[no] == 1) {
						result.setText(text + "번 예약불가");
						btn[no].setForeground(Color.red);
						result.setForeground(Color.red);
					} else {
						seat[no] = 1;
						result.setText(text + "번 예약완료");
						result.setForeground(Color.cyan);
						btn[no].setForeground(Color.cyan);

					}

				}
			});

		} // for

		JButton total = new JButton();
		total.setText("결제 금액");
		total.setFont(new Font("바탕", 1, 40));

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} // if
				} // for
				JOptionPane.showMessageDialog(f, count + "좌석을 예매해서 총 " + (count * 10000) + "원 입니다.");
			}
		});


		f.add(result);
		f.add(total);

		f.setVisible(true);
	}

}
