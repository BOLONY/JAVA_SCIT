package School;

import java.util.Scanner;

public class TypeTest {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Double b = new Double(1.1);
		//Integer(2)가 Number타입이냐
		//Number가 Integer의 부모 클래스.
	//2가 들어가 있는 Integer 객체를 주소 C한테 준다.
		Number c = new Integer(2);
		Number d = new Double(2.2);
		Object e = new Integer(3);
		String f = new String("aaa");
		Object g = new String("ccc");
		
		System.out.println(a instanceof Integer); //정확한 타입 일치
		System.out.println(a instanceof Number);  //상속한 관계에서의 상위타입
		//방법.
		//a는 오브젝트의 객체냐
		//참조변수 instanceof 뒤에 올 클래스
		System.out.println(a instanceof Object);
//		System.out.println(a instanceof Double); //상속관계가 아닌 비교
		System.out.println(c instanceof Double); //상속관계이면서 타입이 일치하지 않음
		//결과: true, false, compile error
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Math.PI);
	}

}
