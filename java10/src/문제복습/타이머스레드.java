package 문제복습;

import java.util.Date;

public class 타이머스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 1000; i > 0; i++) {
			Date date = new Date();
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("문제발생");
			}
		}
		
		
	}
}
