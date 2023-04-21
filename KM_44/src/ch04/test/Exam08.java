package ch04.test;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		int num3 = sc.nextInt();
		
		int result = num3;
		if(result < num1) result = num1;
		if(result < num2) result = num2;
		
		System.out.printf("%d, %d, %d 중 가장 큰 수는 %d 입니다.", num1, num2, num3, result);
	}
}
