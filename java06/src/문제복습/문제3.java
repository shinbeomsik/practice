package 문제복습;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 문제3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setSize(1200, 800);
		f.setTitle("랜덤버튼배열");

		f.setLayout(null);

		JButton[] btn = new JButton[500];

		Font font = new Font("d2coding", 1, 15);

		Random r = new Random();
		Color[] colors = { Color.red, Color.blue, Color.orange, Color.cyan, Color.yellow };
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			int x = r.nextInt(1000);
			int y = r.nextInt(700);
			btn[i].setBounds(x, y, 90, 50);
			btn[i].setBackground(colors[r.nextInt(colors.length)]);
			btn[i].setFont(font);
			f.add(btn[i]);

//			btn[i].addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					String result = e.getActionCommand();
//					int no = Integer.parseInt(result);
//					btn[no].setText(no + "번 버튼");
//					
//					
//				}
//			});
//		}

		}
		f.setVisible(true);

	}
}
