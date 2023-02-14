package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class problem2극장예메 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(450, 1000);
		f.setTitle(" 극장 예매시스템   ");
		f.getContentPane().setBackground(Color.lightGray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("바탕" ,1 ,40);
		Font font2 = new Font("고딕" ,1 ,20);
		
		JLabel title = new JLabel();
		title.setText("  극장 예매 시스템  ");
		title.setFont(font1);
		
		JLabel result = new JLabel();
		result.setText("결과 보이는곳");
		result.setFont(font1);
		
		f.add(title);

		
		JButton[] btn = new JButton[100];
		int[] seat = new int[btn.length];
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font2);				
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					
					if (seat[no] == 1) {
						result.setText("예약불가");
						result.setForeground(Color.red);
						btn[no].setForeground(Color.red);
					} else {
						seat[no] = 1;
						result.setText("예약가능");
						result.setForeground(Color.blue);
						btn[no].setForeground(Color.blue);
					}
					
					
				}
			});
			f.add(btn[i]);
			
		}
		
		
		f.add(result);

		f.setVisible(true);
	}

}
