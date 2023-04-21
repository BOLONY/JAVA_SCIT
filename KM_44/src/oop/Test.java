package oop;

public class Test {

	public static void main(String[] args) {
		int i = 10;
		A a1 = new A();//객체 생성.
		A a2 = new A(100);
		//A 클래스 를 선언. a1 변수 정의 
		//a1 은 참조변수. 가리키는 애다.
		//new. heap영역에 뭔가를 만드는 것.
		//생성자 중에서 기본 생성자는 안만들면 
		//자동으로 만들어진다.
		//heap
		
		a1.num = 1;//객체 안에 변수 넣기
		a1.test();// a안에있는 test메서드 호출
		
		B b1 = new B();
		B b2 = new B(10, 2.34);
		//레퍼런스 변수 선언하고
		//객체 생성.
		
		b2.test();
		System.out.println(b2.toString());
		//오브젝트로 부터 물려 받는다.
		//출력결과로 문자열 리턴
		
		C c = new C();
		c.setBounds(100,100,300,300);
		c.setTitle("웃긴대학");
		c.setVisible(true);
	}//main
}
