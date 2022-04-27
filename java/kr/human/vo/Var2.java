package kr.human.vo;

import kr.human.java0427.Var;

public class Var2 {

	
	public void view() {
		Var var = new Var();//내가 만들었어도 다른 패키지에 있으니 import해야 한다
		
		//System.out.println("private 변수 : "+var.priValue);
		//->private이기에 그 클래스 내부에서만 사용가능하다
		
		//System.out.println("defValue 변수 : "+var.defValue);
		//System.out.println("protected 변수 : "+var.proValue);
		//다른 패키지 에서는 사용 불가능-> 다만 protected는 다른 패키지여도 자식이면 사용가능하다
		
		System.out.println("public 변수 : "+var.pubValue);
	}
	
}
