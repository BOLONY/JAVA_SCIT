package ch04.test;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num3 = sc.nextInt();
		
		int result = num3;
		if(result < num1) result = num1;
		if(result < num2) result = num2;
		
		System.out.printf("%d, %d, %d �� ���� ū ���� %d �Դϴ�.", num1, num2, num3, result);
	}
}
