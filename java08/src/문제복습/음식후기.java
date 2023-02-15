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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 음식후기 {

	public void open() {

		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("후기 쓰기");
		f.getContentPane().setBackground(Color.DARK_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("바탕", 1, 20);
		Font font1 = new Font("d2coding", 1, 20);

		JLabel place = new JLabel("먹었던 지역 :");
		place.setFont(font);
		place.setForeground(Color.white);
		JLabel name = new JLabel(" 가게 이름   :");
		name.setFont(font);
		name.setForeground(Color.white);
		JLabel reply = new JLabel("후기 쓰기 :");
		reply.setFont(font);
		reply.setForeground(Color.white);

		JTextField placeText = new JTextField(22);
		placeText.setFont(font1);
		JTextField nameText = new JTextField(22);
		nameText.setFont(font1);

		JTextArea replyText = new JTextArea(20, 40);

		JButton btn = new JButton("게시판에 저장하기");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String placeText2 = placeText.getText();
				String nameText2 = nameText.getText();
				String replyText2 = replyText.getText();

				String result = "지역 :" + placeText2 + "\n이름 :" + nameText2 + "\n후기 :" + replyText2;
				JOptionPane.showMessageDialog(f, result);

			}
		});

		f.add(place);
		f.add(placeText);
		f.add(name);
		f.add(nameText);
		f.add(reply);
		f.add(replyText);
		f.add(btn);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
