package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	
	static int index;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 250);
		f.setTitle("카운터 프로그램");
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("d2coding", 1 ,20);
		Font font1 = new Font("바탕", 1 ,150);
		
		JLabel label = new JLabel();
		label.setText("");
		label.setFont(font1);
		
		JButton btn1 = new JButton("2 빼기");
		btn1.setFont(font);
		btn1.setForeground(Color.black);
		btn1.setBackground(Color.magenta);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = index - 2;
				label.setText(index + "");
				
			}
		});
		JButton btn2 = new JButton("1 빼기");
		btn2.setFont(font);
		btn2.setForeground(Color.black);
		btn2.setBackground(Color.green);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = index - 1;
				label.setText(index + "");
				
			}
		});
		JButton btn3 = new JButton("0으로 초기화");
		btn3.setFont(font);
		btn3.setForeground(Color.black);
		btn3.setBackground(Color.white);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 0;
				label.setText(index + "");
				
			}
		});
		JButton btn4 = new JButton("1 더하기");
		btn4.setFont(font);
		btn4.setForeground(Color.black);
		btn4.setBackground(Color.green);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = index + 1;
				label.setText(index + "");
				
			}
		});
		JButton btn5 = new JButton("2 더하기");
		btn5.setFont(font);
		btn5.setForeground(Color.black);
		btn5.setBackground(Color.magenta);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = index + 2;
				label.setText(index + "");
				
			}
		});
		
		
		
		
		
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(label);
		
		
		f.setVisible(true);
	}

}
