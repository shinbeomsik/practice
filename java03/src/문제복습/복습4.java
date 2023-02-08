package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 복습4 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.orange);;
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("고딕", 1, 40);
		
		
		JButton b1 = new JButton();
		b1.setText("별10개");
		b1.setFont(font);
		b1.setBackground(Color.magenta);
		JButton b2 = new JButton();
		b2.setText("커피*5");
		b2.setFont(font);
		b2.setBackground(Color.pink);
		JButton b3 = new JButton();
		b3.setText("커피*우유3");
		b3.setFont(font);
		b3.setBackground(Color.magenta);
		JButton b4 = new JButton();
		b4.setText("1.짱!");
		b4.setFont(font);
		b4.setBackground(Color.pink);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 3; i++) {
					System.out.println("커피*우유");

				}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 3; i++) {
					System.out.println("1.짱!");
				}
				
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setVisible(true);
	}

}
