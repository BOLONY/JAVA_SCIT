package ch03.test;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner yas = new Scanner(System.in); 
		//객체를 생성해서 대입을 한다.
		System.out.print("정수를 입력하세요: ");
		int number = yas.nextInt();
		//scanner.nextInt라는 메서드를 생성한다.
		//int 타입 변수에다 값을 넣으면 된다.
		 
		System.out.println("num 의 값: " + number );
//		if(number>0) {
//			System.out.println("result의 값: true");
//		}
//		else {
//			System.out.println("result의 값: false");
//		}
		
//		String result = (number>0) ? "true":"false"; //삼항 연산자
		boolean result = number > 0 ;
		System.out.println("num의 값: "+number);
		System.out.println("result의 값: "+result);
//		System.out.println("result의 값: " + result);
//		string과 none string를 더해도 문자열이 된다.
//		"abc"+10 ==> "abc10", 10+10+"abc" => "20abc"
		
	}
}
