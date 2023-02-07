package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 복습3 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400, 600);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("calculator.jpg");
		
		JLabel text = new JLabel();
		text.setText("숫자1");
		JLabel text2 = new JLabel();
		text2.setText("숫자2");
		JLabel label = new JLabel();
		label.setIcon(icon);
		
		
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);

		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("/");
		JButton b4 = new JButton();
		b4.setText("*");
		
		Font font = new Font("고딕", 1, 20);
		
		text.setFont(font);
		text2.setFont(font);
		
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.red);
		input1.setBackground(Color.black);
		input2.setBackground(Color.black);
		input1.setForeground(Color.white);
		input2.setForeground(Color.white);
		
		f.add(text);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(label);
		
		f.setVisible(true);
		

	}

}
