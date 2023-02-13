package 문제복습;

public class 문제4 {

	public static void main(String[] args) {

		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();

		학기2성적[0] = 22;
		학기2성적[2] = 88;

		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				count++;
			}else if (학기1성적[i] < 학기2성적[i]) {
				count1++;
				String up = "\n성적이 오른 과목은 " + 과목명[i];
				System.out.println(up);
			}
		} // for
		System.out.println();
		System.out.println(count);
		System.out.println(count1);
		
		

		
		
	}

}
