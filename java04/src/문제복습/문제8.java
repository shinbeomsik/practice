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

public class 문제8 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("고딕",1,30);
		Font font2 = new Font("바탕",1,30);
		Font font3 = new Font("궁서",1,30);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		
		JTextField text1 = new JTextField(15);
		text1.setFont(font2);
		text1.setBackground(Color.yellow);
		text1.setForeground(Color.red);
		JTextField text2 = new JTextField(15);
		text2.setFont(font2);
		text2.setBackground(Color.yellow);
		text2.setForeground(Color.red);
		JTextField text3 = new JTextField(15);
		text3.setFont(font2);
		text3.setBackground(Color.yellow);
		text3.setForeground(Color.red);
		JTextField text4 = new JTextField(15);
		text4.setFont(font2);
		text4.setBackground(Color.yellow);
		text4.setForeground(Color.red);
		
		JButton b = new JButton();
		b.setText("회원가입처리");
		b.setFont(font3);
		b.setBackground(Color.pink);
		
		l1.setText("아이디 입력");
		l1.setFont(font1);
		l1.setForeground(Color.blue);
		l2.setText("패스워드 입력");
		l2.setFont(font1);
		l2.setForeground(Color.blue);
		l3.setText("이름 입력");
		l3.setFont(font1);
		l3.setForeground(Color.blue);
		l4.setText("전화번호 입력");
		l4.setFont(font1);
		l4.setForeground(Color.blue);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = text1.getText();
				String pw = text2.getText();
				String name = text3.getText();
				String call = text4.getText();
				
				String result = "아이디는 : " + id + "\n 패스워드:" + pw + "\n 이름:" + name + "\n 전화번호" + call;
				JOptionPane.showMessageDialog(f, result);
				
				
			}
		});
		
		f.add(l1);
		f.add(text1);
		f.add(l2);
		f.add(text2);
		f.add(l3);
		f.add(text3);
		f.add(l4);
		f.add(text4);
		f.add(b);
		
		
		f.setVisible(true);
	}

}
