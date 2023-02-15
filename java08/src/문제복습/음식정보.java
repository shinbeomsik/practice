package 문제복습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식정보 {

	static int index = 2;

	public static void main(String[] args) {

		String[] food = { "간장게장", "대창", "보족", "삼겹살", "스파게티" };
		String[] img = { "간장게장.jpg", "대창.jpg", "보족.jpg", "삼겹살.jpg", "스파게티.jpg" };

		JFrame f = new JFrame();
		f.setSize(550, 550);
		f.setTitle("음식정보");
		f.getContentPane().setBackground(Color.lightGray);

		Font font1 = new Font("고딕", 1, 30);
		Font font2 = new Font("바탕", 1, 40);

		JLabel title = new JLabel(food[2]);
		f.add(title, BorderLayout.NORTH);
		title.setFont(font1);
		title.setForeground(Color.white);
		title.setHorizontalAlignment(0);

		ImageIcon icon = new ImageIcon(img[2]);
		JLabel imgIcon = new JLabel(icon);
		f.add(imgIcon, BorderLayout.CENTER);

		JButton left = new JButton("<<");
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index != 0) {
					title.setText(food[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					imgIcon.setIcon(icon);
					index = index - 1;
				} else {
					index = 4;
				}

			}
		});

		JButton right = new JButton(">>");
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index != 4) {
					title.setText(food[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					imgIcon.setIcon(icon);
					index = index + 1;
				} else {
					index = 0;
				}

			}
		});

		JButton menu = new JButton("후기 쓰러가기");
		menu.setFont(font2);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				음식후기 reply = new 음식후기();
				reply.open();
			}
		});

		f.add(menu, BorderLayout.SOUTH);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
