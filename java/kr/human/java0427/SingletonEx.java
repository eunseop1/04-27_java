package kr.human.java0427;

import java.util.Calendar;
import java.util.Date;

class NonSingleton{
	
}
// 싱글톤 패턴 : 프로그램 실행중에 객체를 유일하게 1개만 만들어 재사용할수 있도록 하는 디자인 패턴
class Singleton{
	//1. 자기 자신의 객체를 정적 멤버로 만든다
	private static Singleton instance = new Singleton();
	//2. 밖에서 객체를 생성하지 못하도록 생성자를 private으로 만든다
	private Singleton() {
		;
	}
	//3. 만들어진 private객체를 리턴하는 정적 메서드를 만든다
	public static Singleton getInstance() {
		return instance;
	}
}
public class SingletonEx {
	public static void main(String[] args) {
		//Singleton singleton = new Singleton(); //이렇게 객체 생성 불가
		
		Singleton singleton1 = Singleton.getInstance(); //이렇게 객체를 얻어서 사용
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		//자바 가상머신(JVM)이 객체를 구분하기 위해 붙이는 일련번호를 해쉬코드라 한다.
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		System.out.println(singleton3.hashCode());
		//해쉬코드가 같다는 것은 동일한 객체라는 의미
		
		NonSingleton ns1 = new NonSingleton();
		NonSingleton ns2 = new NonSingleton();
		System.out.println(ns1.hashCode());
		System.out.println(ns2.hashCode());
		//메모리에 똑같은 기능의 객체가 여러개 생긴다는 의미
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
	}
}
