package 문제복습;

public class 남자 extends 사람{
	
	String 신검받기;
	String 군대가기;
	
	public void 군생활() {
		System.out.println("이등병되다");
		System.out.println("쓸고닦기");
		System.out.println("병장되기");
	}
	

	@Override
	public String toString() {
		return "남자 [신검받기=" + 신검받기 + ", 군대가기=" + 군대가기 + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
