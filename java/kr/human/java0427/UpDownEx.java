package kr.human.java0427;

class Up{
	
	public void show() {
		System.out.println("나는 부모의 메서드입니다");
	}
	
	@Override
	public String toString() {
		return "Up";
	}
}
class Down extends Up{
	public void show() {
		System.out.println("나는 자식의 메서드입니다");
	}
	
	@Override
	public String toString() {
		return "Down";
	}
}

public class UpDownEx {
	public static void main(String[] args) {
		Up up = new Up();
		Down down = new Down();//자신의 타입이 자신의 객체를 가지는 것은 정상
		
		//Down down2 = new Up();//자식의 타입에 부모의 객체를 대입하면 에러
		//Down down2 = (Down)new Up(); //자식의 타입에 부모의 객체를 형변환해서 대입하면 가능하지만(다운캐스팅) 실행하면 ClassCastException에러
		
		Up up2 = new Down(); //부모 타입의 변수에 자식의 객체 대입 가능 -> 업캐스팅
		up2.show();//자식의 메소드가 호출된다
		//부모 변수에 자식을 대입하여 많은 자식들을 컨트롤 할수 있게 된다.
		
		//Down down2 = up2; //부모 타입을 자식에게 대입하는 거라 에러. 다만 up2가 지금은 자식을 가리키기에 
		Down down2 = (Down)up2; //up2가 Up타입이지만 실제 자식의 타입을 가리키고 있어서 예외가 발생하지 않는다
		down2.show();//자식의 메소드가 나온다.
		//다운캐스팅 -> instanceof 연산자를 이용하여 대입여부를 판단해서 대입해줘야 한다. 안그러면 ClassCastException에러
		
		// instanceof 연산자: 객체 instanceof 타입 => 객체를 타입에 대입가능한지를 알려준다
		System.out.println(down instanceof Up);//down을 Up타입에 대입할수 있니?
		System.out.println(down instanceof Down);
		System.out.println(down2 instanceof Up);
		System.out.println(down2 instanceof Down);
		
		System.out.println(up instanceof Up);
		System.out.println(up instanceof Down);
		//형변환을 하고 싶어도 대입이 가능한지 미리 확인하고 넣어야 한다.
		
		
	}
}
