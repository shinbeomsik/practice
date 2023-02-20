package 문제복습;

public class 이미지스레드 extends Thread {
	
	
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
			System.out.println(images[i] + "" );
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println("cpu문제발생");
		}
		}
	}

	
}
