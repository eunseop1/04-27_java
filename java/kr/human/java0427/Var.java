package kr.human.java0427;

public class Var {
	private int priValue =11;
	int defValue =22;
	protected int proValue =33;
	public int pubValue =44;
	
	public void view() {
		//같은 클래스 내부에서는 모두 사용 가능
		System.out.println("private 변수 : "+priValue);
		System.out.println("defValue 변수 : "+defValue);
		System.out.println("protected 변수 : "+proValue);
		System.out.println("public 변수 : "+pubValue);
	}
	
}
