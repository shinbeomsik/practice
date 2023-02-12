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
import javax.swing.JTextField;

public class 문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 600);
		f.getContentPane().setBackground(Color.lightGray);

		Font font1 = new Font("고딕", 1, 30);
		Font font2 = new Font("궁서", 2, 20);
		Font font3 = new Font("바탕", 1, 15);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JTextField text1 = new JTextField(15);
		text1.setFont(font2);
		text1.setBackground(Color.darkGray);
		text1.setForeground(Color.green);
		JTextField text2 = new JTextField(15);
		text2.setFont(font2);
		text2.setBackground(Color.darkGray);
		text2.setForeground(Color.green);
		JTextField text3 = new JTextField(15);
		text3.setFont(font2);
		text3.setBackground(Color.darkGray);
		text3.setForeground(Color.green);
		JTextField text4 = new JTextField(15);
		text4.setFont(font2);
		text4.setBackground(Color.darkGray);
		text4.setForeground(Color.green);
		JTextField text5 = new JTextField(15);
		text5.setFont(font2);
		text5.setBackground(Color.darkGray);
		text5.setForeground(Color.green);

		JButton b1 = new JButton();
		b1.setText("아이디 확인");
		b1.setFont(font3);
		JButton b2 = new JButton();
		b2.setText("비빌번호 확인");
		b2.setFont(font3);
		JButton b3 = new JButton();
		b3.setText("회원가입 처리");
		b3.setFont(font3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String id = text1.getText();
			String id2 = text2.getText();
				
				if (id.equals(id2)) {
					JOptionPane.showMessageDialog(f, "아이디 동일");
				} else {
					JOptionPane.showMessageDialog(f, "아이디 다시확인");

				}
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String pw = text3.getText();
				String pw2 = text4.getText();
				
				if (pw.equals(pw2)) {
					JOptionPane.showMessageDialog(f, "패스워드 동일");
				} else {
					JOptionPane.showMessageDialog(f, "패스워드 다시확인");
					
				}
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = text1.getText();
				String pw = text3.getText();
				String call = text5.getText();
				String result = "아이디 :" + id + "\n패스워드 :" + pw + "\n전화번호 :" + call; 
				
				JOptionPane.showMessageDialog(f, result);
			
				
			}
		});

		JLabel l1 = new JLabel();
		l1.setText("아이디입력");
		l1.setFont(font1);
		JLabel l2 = new JLabel();
		l2.setText("아이디입력 확인");
		l2.setFont(font1);
		JLabel l3 = new JLabel();
		l3.setText("비밀번호 입력 ");
		l3.setFont(font1);
		JLabel l4 = new JLabel();
		l4.setText("비빌번호입력 확인");
		l4.setFont(font1);
		JLabel l5 = new JLabel();
		l5.setText("전화 번호 입력");
		l5.setFont(font1);

		f.add(l1);
		f.add(text1);
		f.add(l2);
		f.add(text2);
		f.add(b1);
		f.add(l3);
		f.add(text3);
		f.add(l4);
		f.add(text4);
		f.add(b2);
		f.add(l5);
		f.add(text5);
		f.add(b3);

		f.setVisible(true);
	}

}
