package kr.human.java0427;

//상수성을 가지면서 객체마다 다른 상수를 가지고 싶은 경우 사용
class FinalMember{
	final double PI;//final이면 상수(변경금지)인데 초기값을 안주면 에러 -> static을 붙이면 안된다
	
	//초기값이 없는 상수 멤버를 사지는 클래스는 반드시 상수를 초기화 할수 있는 생성자를 가져야 한다
	public FinalMember(double pi) {
		PI = pi;//이때는 값이 없기에 변경할수 있게 해준다
	}

	@Override
	public String toString() {
		return "FinalMember [PI=" + PI + "]";
	}
	
	
}
public class FinalInitEx {
	public static void main(String[] args) {
		FinalMember fm1 = new FinalMember(3.14);
		System.out.println(fm1.PI);
		System.out.println(fm1);
		
		FinalMember fm2 = new FinalMember(3.1415);
		System.out.println(fm2.PI);
		
		FinalMember fm3 = new FinalMember(3.141592);
		System.out.println(fm3.PI);
		//객체마다 유효자리수를 다르게 할수 있다
		//극히 드물지만 이처럼 다르게 쓰고 싶을때 사용한다.
		
		//fm3.PI = 3.1; //변경은 불가능
		System.out.println(fm3.toString());
	}
}
