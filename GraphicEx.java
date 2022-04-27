package kr.human.java0427;

class Shape{
	public static final double PI = 3.141592;
	public void draw() { System.out.println("도형을 그립니다."); }
}
class Point extends Shape{
	public void draw() { System.out.println("점을 그립니다."); }
}
class Line extends Shape{
	public void draw() { System.out.println("선을 그립니다."); }
}
class Circle extends Shape{
	public void draw() { System.out.println("원을 그립니다."); }
}
class Rectangle extends Shape{
	public void draw() { System.out.println("사각형을 그립니다."); }
}
public class GraphicEx {
	public static void main(String[] args) {
		Shape[] shapes = {new Shape(),new Point(),new Line(), new Circle(), new Rectangle()};
		
		for(Shape shape : shapes) {
			shape.draw();
		}
	}
}
