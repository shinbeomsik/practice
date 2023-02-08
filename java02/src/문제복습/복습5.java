package 문제복습;

import javax.swing.JOptionPane;

public class 복습5 {

	public static void main(String[] args) {
		
		String menu = JOptionPane.showInputDialog("당신이 먹고싶은 저녁메뉴는 (자장면,라면,회)에서 선택");
		
		if (menu.equals("자장면")) {
			System.out.println("중국집으로가요");
		} else if (menu.equals("라면")) {
			System.out.println("분식집으로가요");
		} else if (menu.equals("회")) {
			System.out.println("횟집으로가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
	}
	
}
