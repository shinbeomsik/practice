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

public class 크롤링돌리기 {
	public static void main(String[] args) {
		크롤링 res = new 크롤링();
		
		JFrame f = new JFrame();
		f.setSize(500, 900);
		f.setTitle("주식정보");
		f.getContentPane().setBackground(Color.lightGray);
		f.setLayout(new FlowLayout());

		Font font = new Font("고딕", 1, 40);

		JLabel code = new JLabel("CODE");
		code.setFont(font);
		
		JTextField textField = new JTextField(7);
		textField.setFont(font);
		
		JTextArea name = new JTextArea(10, 10);
		name.setFont(font);
		
		JButton b1 = new JButton("삼성전자");
		b1.setFont(font);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		
		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				크롤링 c = new 크롤링();
			String[] result = c.naver("005930");
			name.setText("고가 :" + result[0] + "\n저가 :" + result[1] + "\n현재 :" + result[2] + "\n거래량 :" + result[3] + "\n거래대금 :" + result[4]);

			}
		});

		JButton b2 = new JButton("카카오");
		b2.setFont(font);
		b2.setBackground(Color.yellow);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				크롤링 c = new 크롤링();
			String[] result = c.naver("035720");
				name.setText("고가 :" + result[0] + "\n저가 :" + result[1] + "\n현재 :" + result[2] + "\n거래량 :" + result[3] + "\n거래대금 :" + result[4]);
			}
		});

		JButton b3 = new JButton("네이버");
		b3.setFont(font);
		b3.setBackground(Color.orange);

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				크롤링 c = new 크롤링();
				String[] result = c.naver("035420");
				name.setText("고가 :" + result[0] + "\n저가 :" + result[1] + "\n현재 :" + result[2] + "\n거래량 :" + result[3] + "\n거래대금 :" + result[4]);
				
				
				//System.out.println(result[0]);
				//System.out.println(result[1]);
				//System.out.println(result[2]);
				//System.out.println(result[3]);
				//System.out.println(result[4]);
			}
		});
		JButton b4 = new JButton("크롤링시작");
		b4.setFont(font);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				크롤링 c = new 크롤링();
				String number = textField.getText();
				String[] result = c.naver(number);
				name.setText("고가 :" + result[0] + "\n저가 :" + result[1] + "\n현재 :" + result[2] + "\n거래량 :" + result[3] + "\n거래대금 :" + result[4]);
  			}
		});
		
	
		

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(code);
		f.add(textField);
		f.add(b4);
		f.add(name);

		f.setVisible(true);

	}

}
