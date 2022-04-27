package kr.human.java0427;

public class Ex04 {
//클래스안의 클래스 -> 내부클래스
	static class Parent{
		int x =100;
		void method() {
			System.out.println("부모의 메소드!!!");
		}
	}
	static class Child extends Parent{
		int x = 123;
		void method() {
			System.out.println("자식의 메소드!!!");
		}
	}
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(parent.x);
		parent.method();
		
		System.out.println(child.x);
		child.method();
		
		Parent parent2 = new Child();//자식을 부모에 대입하면 뭐가 나올까?
		System.out.println(parent2.x);//변수는 변수의 타입것이 나온다 -> 타입, 변수는 부모
		parent2.method();//그러나 메소드는 현재 가리키는 자기 자신의 것이 나온다 -> 메소드는 자식
		//다만 가능한 이런식으로 된다는 것을 알고 이렇게 코드를 짜면 안된다
	}
}
