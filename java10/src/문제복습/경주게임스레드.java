package 문제복습;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 경주게임스레드 extends Thread {
	int x, y;
	JLabel label;

	public 경주게임스레드(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 150, 150);

	}

	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 150; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 150, 150);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
