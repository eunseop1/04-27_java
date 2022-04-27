package kr.human.java0427;

class Some2{
	final public void show() {//메소드 앞에 final이 붙으면 오버라이딩 금지
		System.out.println("나는 오버라이딩 할 수 없다");
	}
}
/*
class ChildSome2 extends Some2{
	//에러 -> final메소드는 오버라이딩 불가능
	public void show() {
		System.out.println("나는 오버라이딩 할 수 없다");
	}
}

final class FinalClass{//final클래스는 상속 금지
	
}
class Child extends FinalClass{
	//에러 -> final클래스는 상속 금지
}
*/
public class finalEx {
	//변수명 앞에 final이 붙으면 변경금지
	static final int MAX = 1024;//보통 static과 함께 사용
	final static int MAX2 = 1024;
	
	public static void main(String[] args) {
		System.out.println("MAX = " + MAX);
		//MAX = 2048; //변경할수 없기에 에러
	}
}
