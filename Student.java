package kr.human.java0427;

public class Student extends Human {
	private String stuNo;
	
	public Student(String stuNo, String name) {
		super(name);
		this.stuNo = stuNo;
	}
	// 오버라이딩 : 기능 변경
	public void think() {
		System.out.println("이번 중간고사를 잘봐야할텐테!!!!");
	}
	// 기능 추가
	public void study() {
		System.out.println("하늘천 땅지 검을현.....");
	}
}
