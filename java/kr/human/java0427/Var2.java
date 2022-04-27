package kr.human.java0427;

public class Var2 {

	
	public void view() {
		Var var = new Var();
		
		//System.out.println("private 변수 : "+var.priValue);
		//->private이기에 그 클래스 내부에서만 사용가능하다
		
		System.out.println("defValue 변수 : "+var.defValue);//같은 패키지 내에서는 사용가능
		System.out.println("protected 변수 : "+var.proValue);
		System.out.println("public 변수 : "+var.pubValue);
	}
	
}
