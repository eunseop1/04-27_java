package kr.human.java0427;
/*
 * 1. 동일한 부모를 가진다
 * 2. 부모의 메서드를 오버라이딩 한다
 * 3. 부모의 변수에 자식 객체를 대입해서 자식을 컨트롤한다
 */

//추상클래스 -> 추상 메소드를 하나 이상 가지는 클래스, 미완성 클래스라서 객체 생성 불가
abstract class Shape {
	public static final double PI = 3.141592;

	abstract public void draw();// 내용이 없는 메소드 -> 추상메소드
	// 왜 만드느냐? 규칙을 정하기 위해서
	// 상속받는 자식 클래스에게 반드시 오버라이딩 하라고 의무를 부여한다
	// -> 코딩할때 오버라이딩을 빼먹으면 오류로 알려줘서 실수방지 할수 있다
}
/*
 * class Shape { public static final double PI = 3.141592;
 * 
 * public void draw() { System.out.println("도형을 그립니다."); } }
 */

//추상 클래스 보다 추상도가 높은 클래스를 자바에서 인터페이스라고 부른다
//일반 변수나 메소드를 가질 수 없다 -> 상수와 추상매소드 만으로 구성
//인터페이스는 상속이 아니라 구현한다고 표현 -> implements를 사용, 여러개의 인터페이스 implements가능
//인터페이스도 상속이 가능
interface Graphic {
	double PI = 3.1415;// final static을 안써도 자동으로 써준다

	void move();// public이 자동으로 붙는다 -> 반드시 오버라이딩하게 하기 위함

	void remove();
}
//이로인해 다중 상속의 이점을 살리고, 모호성을 줄인다

interface Graphic2 {
	void rotate();
}

interface Graphics extends Graphic, Graphic2{
	void resize();
}

class Point extends Shape implements Graphic, Graphic2 {//인터페이스의 다중구현
	// 인터페이스가 있으니 move()와 remove() / rotate() 도 반드시 구현해야 한다
	public void draw() {
		System.out.println("점을 그립니다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("선을 그립니다.");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

//다양성의 예시 -> 모두다 동일한 부모가 있어야 한다는 전제조건이 있다
//자식은 부모의 메소드를 오버라이딩 해야 한다
public class GraphicEx {
	public static void main(String[] args) {
		//Shape[] shapes = { new Shape(), new Point(), new Line(), new Circle(), new Rectangle() };
		Shape[] shapes = { new Point(), new Line(), new Circle(), new Rectangle() };
		
		for (Shape shape : shapes) {// 부모 타입의 변수
			shape.draw();// 자식의 메소드 호출
		}
	}
}