package oop;

public class A {
	//멤버 변수
	int num;
	
	//public은 외부에서 실행하게 하라는 메서드
	public A() {
		System.out.println("A의 A()");
	}
	//괄호안에 아무것도 없으면 기본 생성자.
	
	public A(int n) {
		num = n;
		//this.num = n;
		System.out.printf("A의 A(int) %d\n", n);
	}
	
	//메소드
	//public 접근지정자. 외부에서 건드려도 된다.
	//메서드. 불러내서 실행시키는
	public void test() {
		System.out.println("A클래스의 test() 메소드");
	}
}
