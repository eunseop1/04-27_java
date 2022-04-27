package kr.human.vo;

import kr.human.java0427.Var;

public class Var3 extends Var {

	
	public void view() {
		
		//System.out.println("private 변수 : "+var.priValue);
		//->private이기에 자식이어도 사용 불가
		
		//System.out.println("defValue 변수 : "+var.defValue);
		//같은 패키지가 아니어서 자식도 사용불가
		
		System.out.println("protected 변수 : "+ proValue);
		//protected는 다른 패키지여도 자식이면 사용가능하다
		
		System.out.println("public 변수 : "+pubValue);
	}
	
}
