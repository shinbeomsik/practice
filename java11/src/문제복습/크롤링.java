package 문제복습;

import javax.swing.JOptionPane;
import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링 extends 크롤링돌리기 {

	public String[] naver(String code) {

		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code);
		Document doc = null;
		String[] result = null;
 		try {
			doc = con.get();
			Elements codeList = doc.select("span.blind");
//			for (int i = 0; i < codeList.size(); i++) {
//				System.out.println(i + " :" + codeList.get(i));
//			}

			Element tag1 = codeList.get(16);
			String high = tag1.text();

			Element tag2 = codeList.get(20);
			String low = tag2.text();

			Element tag3 = codeList.get(12);
			String today = tag3.text();

			Element tag4 = codeList.get(18);
			String length = tag4.text();

			Element tag5 = codeList.get(21);
			String price = tag5.text();

			//String result = "고가 :" + high + "\n저가 :" + low + "\n현재 :" + today + "\n거래량 :" + length + "\n거래대금 :" + price;
			result = new String[]{high , low, today, length, price};
			//JOptionPane.showMessageDialog(null, result);

		} catch (Exception e) {
			e.printStackTrace();
		}
 		
 		return result;
	}
	
	
}
