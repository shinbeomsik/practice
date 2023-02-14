package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class problem {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1200, 700);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		
		f.setLayout(null);
		
		JButton[] btn = new JButton[500];
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
		}//for
		
		Random r = new Random();
		Color[] colors = { Color.red, Color.blue, Color.orange, Color.cyan, Color.yellow };
		
		for (int i = 0; i < btn.length; i++) {
			int x = r.nextInt(1000);
			int y = r.nextInt(500);
			
			btn[i].setBounds(x, y, 100, 50);
			btn[i].setBackground(colors[r.nextInt(colors.length)]);
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String data = e.getActionCommand();
					int b = Integer.parseInt(data);
					JOptionPane.showMessageDialog(f, b + "번 버튼이당");
				}
			});
			
			f.add(btn[i]);
		}//for
		
	
		
		
		
		
		f.setVisible(true);
		
		
	}

}
