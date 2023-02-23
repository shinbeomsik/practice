package 문제복습;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 음식주문화면 {
	int count1, count2, count3, count4, count5;
	int price1 = 1000;
	int price2 = 2500;
	int price3 = 1500;
	int price4 = 2000;
	int price5 = 500;

	public void foodOpen() {
		JFrame f = new JFrame("음식주문화면");
		f.setSize(1800, 1000);
		f.setLayout(new FlowLayout());

		ImageIcon foodIcon1 = new ImageIcon("간장게장.jpg");
		ImageIcon foodIcon2 = new ImageIcon("대창.jpg");
		ImageIcon foodIcon3 = new ImageIcon("보족.jpg");
		ImageIcon foodIcon4 = new ImageIcon("삼겹살.jpg");
		ImageIcon foodIcon5 = new ImageIcon("스파게티.jpg");

		JLabel foodMenu = new JLabel("간장게장1인분 1000원 대창1인분 2500원 보족1인분 1500원 삼겹살1인분 2000원 스파게티1인분 500원");

		Font font = new Font("d2coding", 1, 30);
		foodMenu.setFont(font);

		JLabel foodLabel = new JLabel("음식가격 :");
		foodLabel.setFont(font);

		JLabel foodCount = new JLabel("음식갯수 :");
		foodCount.setFont(font);

		JTextField foodPrice = new JTextField(20);
		foodPrice.setFont(font);

		JTextArea foodCount2 = new JTextArea(9, 15);
		foodCount2.setFont(font);

		JButton foodButton1 = new JButton(foodIcon1);

		foodButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count1++;
				String countResult = "간장게장 :" + count1 + "\n대창 :" + count2 + "\n보족 :" + count3 + "\n삼겹살 :" + count4
						+ "\n스파게티 :" + count5;
				foodCount2.setText(countResult);
				String priceResult = count1 * price1 + count2 * price2 + count3 * price3 + count4 * price4
						+ count5 * price5 + "원";
				foodPrice.setText(priceResult);
			}
		});

		JButton foodButton2 = new JButton(foodIcon2);

		foodButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count2++;
				String countResult = "간장게장 :" + count1 + "\n대창 :" + count2 + "\n보족 :" + count3 + "\n삼겹살 :" + count4
						+ "\n스파게티 :" + count5;
				foodCount2.setText(countResult);
				String priceResult = count1 * price1 + count2 * price2 + count3 * price3 + count4 * price4
						+ count5 * price5 + "원";
				foodPrice.setText(priceResult);
			}
		});

		JButton foodButton3 = new JButton(foodIcon3);

		foodButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count3++;
				String countResult = "간장게장 :" + count1 + "\n대창 :" + count2 + "\n보족 :" + count3 + "\n삼겹살 :" + count4
						+ "\n스파게티 :" + count5;
				foodCount2.setText(countResult);
				String priceResult = count1 * price1 + count2 * price2 + count3 * price3 + count4 * price4
						+ count5 * price5 + "원";
				foodPrice.setText(priceResult);
			}
		});
		JButton foodButton4 = new JButton(foodIcon4);

		foodButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count4++;
				String countResult = "간장게장 :" + count1 + "\n대창 :" + count2 + "\n보족 :" + count3 + "\n삼겹살 :" + count4
						+ "\n스파게티 :" + count5;
				foodCount2.setText(countResult);
				String priceResult = count1 * price1 + count2 * price2 + count3 * price3 + count4 * price4
						+ count5 * price5 + "원";
				foodPrice.setText(priceResult);
			}
		});
		JButton foodButton5 = new JButton(foodIcon5);

		foodButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count5++;
				String countResult = "간장게장 :" + count1 + "\n대창 :" + count2 + "\n보족 :" + count3 + "\n삼겹살 :" + count4
						+ "\n스파게티 :" + count5;
				foodCount2.setText(countResult);
				String priceResult = count1 * price1 + count2 * price2 + count3 * price3 + count4 * price4
						+ count5 * price5 + "원";
				foodPrice.setText(priceResult);
			}
		});
		JButton b6 = new JButton("후기쓰러가기");
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				게시판화면 next= new 게시판화면();
				next.menuopen();
			}
		});
		
		f.add(foodMenu);
		f.add(foodButton1);
		f.add(foodButton2);
		f.add(foodButton3);
		f.add(foodButton4);
		f.add(foodButton5);
		f.add(foodCount);
		f.add(foodCount2);
		f.add(foodLabel);
		f.add(foodPrice);
		f.add(b6);

		f.setVisible(true);

	}
}
