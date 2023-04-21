package ch05;

import java.util.Scanner;

public class FuntctionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 20;
		
		FuntctionTest t = new FuntctionTest();//넌 스태틱 함수를 선언시 객체 생성하고 생성한 객체 호출.
		//힙은 일반적인 멤버변수 값이 올라감. 사용하기 전에만 객체가 생성되면된다.
		int sum = t.add(num1, num2);
		System.out.println(num1 + "+" + num2 + " = " + sum + "입니다.");
	}
	 
	public int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}
