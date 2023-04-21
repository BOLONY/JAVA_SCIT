package ch04.test;

import java.util.Scanner;

public class PracticeQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력: ");
		char cal = sc.next().charAt(0); 
		
		int result = 0;
		
		switch(cal) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		}//end of switch
		
		System.out.printf("%d %s %d = %d",num1, cal, num2, result);
	}//end of main
}//end of class
