package 문제복습;

public class 복습7 {

	public static void main(String[] args) {
		
		String no = "B100EX";
		char a = no.charAt(0);
		
		switch (a) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서 없음");
			break;
		}
		
	}
	
}
