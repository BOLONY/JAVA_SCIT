package ch04.test;

import java.util.Scanner;

public class AnswerQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값1 입력: ");
		double va1 = sc.nextDouble();
		System.out.print("값2 입력: ");
		double va2 = sc.nextDouble();
		System.out.print("연산자 입력: ");
		String operator = sc.next();
		
		//flag변수. 분모가 0이면 계산 불가능을 판별.
//		boolean is_print = true;
		
		double result = 0.0;
		//객체의 값을 비교할 떄는 equals() 메서드를 사용한다.
		//String은 참조형 데이터타입
		if(operator.equals("+")) {
			result = va1 + va2;
		}else if(operator.equals("-")) {
			result = va1 - va2;
		}else if(operator.equals("*")) {
			result = va1 * va2;
		}else if(operator.equals("/")) {
			if(va2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
//				is_print = false;
				return; //이 메서드의 실행을 여기서 중단하라.
			}else {
				result = va1 / va2;
			}                       
		}else {
			System.out.println("연산자 오류!");
		}
		
//		if(is_print) System.out.printf("%.2f %s %.2f = %.2f",va1, operator, va2, result);
		System.out.printf("%.2f %s %.2f = %.2f",va1, operator, va2, result);
	}//end of main

}

//ret
