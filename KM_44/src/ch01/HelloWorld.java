package ch01;
import ch03.test.Account;
/** 이 클래스는 000을 위한 클래스 입니다.*/
public class HelloWorld {

	public static void main(String[] args) {
		/*여러 줄 주석임*/
		/** document 주석*/
		System.out.println("Hello World!");
		System.out.println("Java Programming");
		
		Account a2 = new Account("11-11", "홍길동", 500);
		//패키지가 다르면 임포트를 해줘야한다.
	}
	
}
