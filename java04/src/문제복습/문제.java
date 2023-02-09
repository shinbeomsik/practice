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

public class 문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 1000);
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();
		JLabel l7 = new JLabel();
		
		
		Font font1 = new Font("고딕",1,40);
		Font font2 = new Font("D2coding",1,30);
		Font font3 = new Font("궁서",1,18);
		
		l1.setText("인기투표를 해봅시다.");
		l1.setFont(font1);
		l2.setText("산");
		l2.setFont(font2);
		l4.setText("바다");
		l4.setFont(font2);
		l6.setText("스키장");
		l6.setFont(font2);
		
		l3.setFont(font3);
		l5.setFont(font3);
		l7.setFont(font3);
		
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		ImageIcon icon1 = new ImageIcon("바다.jpg");
		ImageIcon icon2 = new ImageIcon("산.jpg");
		ImageIcon icon3 = new ImageIcon("스키장.jpg");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		b1.addActionListener(new ActionListener() {
			int a = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a++;
				l3.setText(a + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int b = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b++;
				l5.setText(b + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int c = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c++;
				l7.setText(c + "표");
			}
		});
		
		
		f.add(l1);
		
		f.add(b1);
		f.add(l2);
		f.add(l3);
		
		f.add(b2);
		f.add(l4);
		f.add(l5);
		
		f.add(b3);
		f.add(l6);
		f.add(l7);
		
		
		f.setVisible(true);

	}

}
