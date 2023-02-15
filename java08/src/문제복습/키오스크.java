package 문제복습;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 키오스크 {
		
		static int count;
		static int count1;
		static int count2;
		static int count3;
		static int count4;
		static int count5;
		final static int PIRCE1 = 20000;
		final static int PIRCE2 = 15000;
		final static int PIRCE3 = 25000;
		final static int PIRCE4 = 10000;
		final static int PIRCE5 = 8000;
		


	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(900, 1200);
		f.setTitle("음식들");
		f.getContentPane().setBackground(Color.green);

		f.setLayout(null);

		Font font = new Font("고딕", 1, 20);
		Font font1 = new Font("바탕", 1, 30);

		JLabel countLabel = new JLabel("개수 :");
		countLabel.setBounds(300, 100, 150, 70);
		countLabel.setFont(font1);
		
		

		JTextField countText = new JTextField(50);
		countText.setBounds(400, 110, 300, 50);
		countText.setFont(font1);
		countText.setBackground(Color.yellow);
		countText.setForeground(Color.blue);

		ImageIcon icon = new ImageIcon("입구.jpg");
		JLabel img = new JLabel();
		img.setBounds(300, 200, 500, 500);
		img.setIcon(icon);

		JLabel priceText = new JLabel("결제 금액 : ");
		priceText.setFont(font1);
		priceText.setBounds(300, 700, 200, 200);

		JLabel priceText1 = new JLabel("");
		priceText1.setFont(font1);
		priceText1.setBounds(500, 700, 500, 200);

		JButton btn1 = new JButton("간장게장");
		btn1.setBounds(100, 100, 150, 70);
		btn1.setFont(font);
		btn1.setBackground(Color.blue);
		btn1.setForeground(Color.white);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("간장게장.jpg");
				img.setIcon(icon);
				count++;
				countText.setText(count + "개");
				count1++;
				String total = count1*PIRCE1 + count2*PIRCE2 + count3*PIRCE3 + count4*PIRCE4 + count5*PIRCE5 + "원"; 
				f.setTitle("간장게장 :" + count1 + " 대창 :" + count2 + " 보족 :" + count3 + " 삼겹살 :" + count4 + " 스파게티 :" + count5);
				priceText1.setText(total);
				
			}
		});

		JButton btn2 = new JButton("대창");
		btn2.setBounds(100, 300, 150, 70);
		btn2.setFont(font);
		btn2.setBackground(Color.pink);
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("대창.jpg");
				img.setIcon(icon);
				count++;
				countText.setText(count + "개");
				count2++;
				String total = count1*PIRCE1 + count2*PIRCE2 + count3*PIRCE3 + count4*PIRCE4 + count5*PIRCE5 + "원"; 
				f.setTitle("간장게장 :" + count1 + " 대창 :" + count2 + " 보족 :" + count3 + " 삼겹살 :" + count4 + " 스파게티 :" + count5);
				priceText1.setText(total);
			}
		});

		JButton btn3 = new JButton("보족");
		btn3.setBounds(100, 500, 150, 70);
		btn3.setFont(font);
		btn3.setBackground(Color.magenta);

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("보족.jpg");
				img.setIcon(icon);
				count++;
				countText.setText(count + "개");
				count3++;
				String total = count1*PIRCE1 + count2*PIRCE2 + count3*PIRCE3 + count4*PIRCE4 + count5*PIRCE5 + "원"; 
				f.setTitle("간장게장 :" + count1 + " 대창 :" + count2 + " 보족 :" + count3 + " 삼겹살 :" + count4 + " 스파게티 :" + count5);
				priceText1.setText(total);
			}
		});

		JButton btn4 = new JButton("삼겹살");
		btn4.setBounds(100, 700, 150, 70);
		btn4.setFont(font);
		btn4.setBackground(Color.cyan);

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("삼겹살.jpg");
				img.setIcon(icon);
				count++;
				countText.setText(count + "개");
				count4++;
				String total = count1*PIRCE1 + count2*PIRCE2 + count3*PIRCE3 + count4*PIRCE4 + count5*PIRCE5 + "원"; 
				f.setTitle("간장게장 :" + count1 + " 대창 :" + count2 + " 보족 :" + count3 + " 삼겹살 :" + count4 + " 스파게티 :" + count5);
				priceText1.setText(total);
			}
		});

		JButton btn5 = new JButton("스파게티");
		btn5.setBounds(100, 900, 150, 70);
		btn5.setFont(font);
		btn5.setBackground(Color.orange);

		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("스파게티.jpg");
				img.setIcon(icon);
				count++;
				countText.setText(count + "개");
				count5++;
				String total = count1*PIRCE1 + count2*PIRCE2 + count3*PIRCE3 + count4*PIRCE4 + count5*PIRCE5 + "원"; 
				f.setTitle("간장게장 :" + count1 + " 대창 :" + count2 + " 보족 :" + count3 + " 삼겹살 :" + count4 + " 스파게티 :" + count5);
				priceText1.setText(total);
			}
		});

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(countLabel);
		f.add(countText);
		f.add(img);
		f.add(priceText);
		f.add(priceText1);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
