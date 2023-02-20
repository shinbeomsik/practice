package 문제복습;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 경주게임 extends JFrame {

	public static void main(String[] args) {
		경주게임 f = new 경주게임();
	}

	public 경주게임() {
		setTitle("오늘 뭐먹징??");
		setSize(1800, 1000);
		setLayout(null);
		
		경주게임스레드 food1 = new 경주게임스레드("간장게장.jpg", 100, 100);
		경주게임스레드 food2 = new 경주게임스레드("대창.jpg", 400, 100);
		경주게임스레드 food3 = new 경주게임스레드("보족.jpg", 700, 100);
		경주게임스레드 food4 = new 경주게임스레드("삼겹살.jpg", 1000, 100);
		경주게임스레드 food5 = new 경주게임스레드("스파게티.jpg", 1300, 100);

		food1.start();
		food2.start();
		food3.start();
		food4.start();
		food5.start();

		setVisible(true);
	}

	public class 경주게임스레드 extends Thread {
		int x, y;
		JLabel label;

		public 경주게임스레드(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 300, 300);
			add(label);

		}

		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 150; i++) {
				int move = r.nextInt(50);
				y = y + move;
				label.setBounds(x, y, 300, 300);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}

	}

}
