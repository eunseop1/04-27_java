package kr.human.java0427;

class Paraent {
	public Paraent() {
		System.out.println("Parent 생성자 호출");
	}
}

class Child extends Paraent { // 상속받아 child클래스를 만든다
	public Child() {
		System.out.println("Child 생성자 호출");
	}
}

class GrandChild extends Child {
	public GrandChild() {
		// 내가 super()라고 안써도 자동으로 삽입되었다는 의미 -> 자신의 부모 생성자들을 호출한다
		System.out.println("GrandChild 생성자 호출");
	}
}

class Some {
	int value;

	public Some(int value) {
		this.value = value;
	}
}

class SomeChild extends Some {
	public SomeChild() {
		//super();가 자동으로 삽입된다 -> 
		//그러나 부모클래스에 빈 괄호의 기본생성자가 없으니 에러(다른 생성자를 만들면 기본생성자가 없어지므로)
		
		//해결법은 부모클래스를 고치거나 내것을 고치는 방법이 있다 -> 이미 사용되고 있는 부모보다는 자식에 손을 댄다
		super(0);
	}
}

class Name{
	String name;
	public Name(String name) {
		this.name = name;

	}
	
	@Override
	public String toString() {
		return name.toUpperCase();//이름을 대문자로 바꿔서 리턴
	}
}

class NameChild extends Name{
	int age;
	public NameChild(String name, int age) {
		super(name);
		this.age = age;
	}
	@Override
	public String toString() {
		return super.toString() + " (" + age + "세)"; //부모의 메서드 호출하고 추가로 나이까지 찍는다
	}
}
//원래는 클래스 하나당 파일 하나로 해야하는데, 가독성을 위해서 일부러 몰아썼다
//하나의 파일에 클래스를 여러개 만들경우 파일 이름과 같은 클래스에만 public을 쓸수 있다. 
//-> 다른 파일에서 사용을 못하기에 다른 곳에서 사용이 가능하도록 여러 파일로 쪼개야 한다.
public class ex01 {
	public static void main(String[] args) {
		// 상속받은 클래스의 객체를 만들면 부모 클래스의 생성자부터 차레대로 호출이 된다
		GrandChild grandChild = new GrandChild();

		NameChild nameChild = new NameChild("kim", 34);
		System.out.println(nameChild);
	}
}
