package oop;

public class B extends A {
	double dnum;
	
	public B() {
		super(); //정리: 상위클래스의 기본생성자 호출
		//생략하면 기본생성자. 그외는 명시적 호출
		//하위클래스의 생성자의 첫줄에서만 호출가능
		/*super(); //상위 클래스(A)의 기본 생성자 호출*/
		System.out.println("B의 B()");
	}
	
	public B(int n, double d) {
		//1. 부모 클래스의 기본 생성자를 호출
		//this는 내꺼 부모는 super 따라서 super.변수명;
		/*super(n); //명시적 생성한거 보여줬다. 쌤이*/
		//num = n;
		super(n);
		dnum =d;
		System.out.println("B의 B(int, double)");
	}
}
