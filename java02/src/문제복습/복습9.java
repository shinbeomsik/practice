package 문제복습;

import java.io.ObjectInputStream.GetField;
import java.util.Date;

import javax.swing.JOptionPane;

public class 복습9 {

	public static void main(String[] args) {
		
	Date date = new Date();
	
	int year = date.getYear() + 1900;
	int day = date.getDay();
	int month = date.getMonth() + 1;
	
	if (year >= 2000) {
		System.out.println("밀레니엄 세대시군요.");
	} else {
		System.out.println("밀레니엄 세대가 아니시군요");
	}
	
	switch (day) {
	case 0: case 6: 
		System.out.println("쉬~~~~~~자");
		break;
	
	default:
		System.out.println("열~~심히 공부하자");
		break;
	}
	
	switch (month) {
	case 2:
		for (int i = 1; i < 29; i++) {
			System.out.println(i);
		}
		break;
	case 4: case 6: case 9: case 11:
		for (int k = 1; k < 31; k++) {
			System.out.println(k);
		}
		break;

	default:
		for (int j = 1; j < 32; j++) {
			System.out.println(j);
		}
		break;
	}
	}
	
}
