package ch04.test;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값1 입력: ");
		double va1 = sc.nextDouble();
		System.out.print("값2 입력: ");
		double va2 = sc.nextDouble();
		System.out.print("연산자 입력: ");
		String operator = sc.next();
		
		double result = 0.0;
		//switch는 연산자를 조건변수로 쓴다.
		//switch의 조건변수는 문자열을 조건변수로 사용 불가능했으나 패치이후 가능해짐.
		switch(operator) {
		case"+": result = va1 + va2;
			break;
		case"-": result = va1 - va2;
			break;
		case"*": result = va1 * va2;
			break;
		case"/": result = va1 / va2;
		if(va2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; 
		}else {
			result = va1 / va2;
		}
			break;
		default: System.out.println("연산자 오류!");
		}//switch
		System.out.printf("%.2f %s %.2f = %.2f",va1, operator, va2, result);
	}//main

}
