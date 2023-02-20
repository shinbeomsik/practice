package 문제복습;

import java.util.HashSet;
import java.util.Random;

public class 문제3 {
	public static void main(String[] args) {
		Random r = new Random();

		HashSet lotto = new HashSet();
		for (int i = 0; lotto.size() < 6; i++) {
			int number = r.nextInt(45) + 1; //0~44 에서 1을 더해서 1~45까지
			lotto.add(number);

		}
		System.out.println(lotto);

	}
}
