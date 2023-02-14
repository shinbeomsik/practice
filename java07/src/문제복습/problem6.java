package 문제복습;

public class problem6 {

	public static void main(String[] args) {
		String[] name = { "국어", "영어", "수학", "컴퓨터", "회화" };

		int[] level = { 44, 66, 22, 99, 100 };
		int[] level2 = level.clone();

		level2[0] = 22;
		level2[2] = 88;

		for (int i = 0; i < level2.length; i++) {
			System.out.print(level[i] + " ");

		}//for
		System.out.println();
		for (int i = 0; i < level2.length; i++) {
			System.out.print(level2[i] + " ");

		}//for
		System.out.println();
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < level2.length; i++) {
			if (level[i] == level2[i]) {
				count++;
			}else if (level[i] < level2[i]) {
				count1++;
				System.out.println(name[i]);
			}
		}//for
		System.out.println("성적이 동일한 과목수 :" + count);
		System.out.println("성적이 오른 과목수 :" + count1);
		
		
		

	}

}
