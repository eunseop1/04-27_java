package kr.human.java0427;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Human{
	private String stuNo;
	
	public Student(String stuNo, String name) {
		super(name);//이름은 부모에 전달해서 초기화
		this.stuNo = stuNo;
	}
	
	//오버라이딩: 기능 변경
	@Override
	public void think() {
		System.out.println("중간고사 잘봐야지!!!!");
	}
	
	//기능추가
	public void study() {
		System.out.println("하늘 천, 땅 지, 검을 현, 누를 황");
	}
	
}
