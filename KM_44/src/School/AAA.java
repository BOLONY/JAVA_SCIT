package School;

public class AAA {//public, abstract, final,
	
	class D { //내부 클래스 public, private static
		
	}
}

class B {
	
}

abstract class C extends AAA {
	//맴버 변수에 쓸수 있는 키워드
	private B ob; //public, protected, private, final, static, 
	
	//메서드에 쓸 수 있는 키워드
	void test() { //public, protected, private, final, static, abstract
		
	}
	//그중 예 하나.
	abstract void test2();
}

abstract class E extends C{}
