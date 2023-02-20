package 문제복습;

public class 카운터스레드 extends Thread {

	@Override
	public void run() {
		
		for (int i = 500; i < 0; i--) {
			System.out.println("" + i);
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("문제발생");
	}
		}
		
	}
	
}
