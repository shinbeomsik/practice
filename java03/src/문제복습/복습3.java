package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 복습3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("D2coding",1,40);
		Font font1 = new Font("고딕",1,30);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("22.jpg");
		
		JLabel label = new JLabel();
		label.setText("사용자 ID입력");
		label.setFont(font);
		label.setForeground(Color.blue);
		JLabel label2 = new JLabel();
		label2.setText("사용자 pw입력");
		label2.setFont(font);
		label2.setForeground(Color.blue);
		
		JTextField text1 = new JTextField(10);
		text1.setFont(font1);
		text1.setBackground(Color.yellow);
		text1.setForeground(Color.red);
		JTextField text2 = new JTextField(10);
		text2.setFont(font1);
		text2.setBackground(Color.yellow);
		text2.setForeground(Color.red);
		
		JButton b = new JButton();
		b.setIcon(icon);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				if (s1.equals("신범식") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인성공");
				} else {
					JOptionPane.showMessageDialog(f, "로그인실패");
				}
				
			}
		});
		
		f.add(label);
		f.add(text1);
		f.add(label2);
		f.add(text2);
		f.add(b);
		f.setVisible(true);
	}

}
