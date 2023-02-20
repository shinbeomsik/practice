package 문제복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 피시방스레드 extends JFrame {
	
	JLabel count, image , time;
	public static void main(String[] args) {
		피시방스레드 f = new 피시방스레드();
		
	}
	public 피시방스레드() {
		setTitle("먹을거 카운트다운");
		setSize(500,500);
		getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("바탕" , 1 , 30);
		
		count = new JLabel("카운터");
		count.setFont(font);
		
		ImageIcon icon = new ImageIcon("간장게장.jpg");
		image = new JLabel(icon);
		time = new JLabel("시간");
		time.setFont(font);
		
		add(count);
		add(image);
		add(time);
		
		카운터스레드2 count2 = new 카운터스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2(); 
		count2.start();
		image2.start();
		time2.start();
		setVisible(true);
	}

	public class 이미지스레드2 extends Thread {
		
		
		@Override
		public void run() {
			String[] images = 
				{ "간장게장.jpg" , "대창.jpg" , "보족.jpg" , "삼겹살.jpg" , "스파게티.jpg",
						"간장게장.jpg" , "대창.jpg" , "보족.jpg" , "삼겹살.jpg" , "스파게티.jpg",
						"간장게장.jpg" , "대창.jpg" , "보족.jpg" , "삼겹살.jpg" , "스파게티.jpg",
						"간장게장.jpg" , "대창.jpg" , "보족.jpg" , "삼겹살.jpg" , "스파게티.jpg",
						"간장게장.jpg" , "대창.jpg" , "보족.jpg" , "삼겹살.jpg" , "스파게티.jpg"
				};
			
			
			for (int i = 0; i < images.length; i++) {
			
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu문제발생");
			}
			}
		}

		
	}//이미지스레드
	
	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i++) {
				Date date = new Date();
				time.setText("" + date);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("문제발생");
				}
			}
			
			
		}
	}//타이머스레드
	
	public class 카운터스레드2 extends Thread {

		@Override
		public void run() {
			
			for (int i = 500; i > 0; i--) {
				count.setText("카운트 >> " + i);
				
				try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("문제발생");
		}
			}
			
		}
		
	}//카운터스레드



	
}
