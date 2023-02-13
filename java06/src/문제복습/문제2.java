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

public class 문제2 {

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

		JButton total = new JButton();
		total.setText("결제 금액");
		total.setFont(new Font("바탕", 1, 40));

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
			} // if

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

					} // if

				}
			});

		} // for

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int orange = 0;
				int pink = 0;
				int yellow = 0;
				
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1 && i < 30) {
					orange++;
				} else if (seat[i] == 1 && 30 <= i && i < 72) {
					pink++;
				} else if (seat[i] == 1 && 72 <= i && i < seat.length){
					yellow++;
				}
			}
				
				
				String price = "예매가격은" + (orange * 5000 + pink * 10000 + yellow * 7000) + "입니다.";
				JOptionPane.showMessageDialog(f, price);
			}
		});

		JLabel menu = new JLabel();
		menu.setText("오렌지색 좌석 :  5000원   핑크색 좌석  : 10000원    노란색좌석 : 7000원");
		menu.setForeground(Color.white);

		f.add(result);
		f.add(total);
		f.add(menu);

		f.setVisible(true);
	}

}
