package ch04.test;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 �Է�: ");
		double va1 = sc.nextDouble();
		System.out.print("��2 �Է�: ");
		double va2 = sc.nextDouble();
		System.out.print("������ �Է�: ");
		String operator = sc.next();
		
		double result = 0.0;
		//switch�� �����ڸ� ���Ǻ����� ����.
		//switch�� ���Ǻ����� ���ڿ��� ���Ǻ����� ��� �Ұ��������� ��ġ���� ��������.
		switch(operator) {
		case"+": result = va1 + va2;
			break;
		case"-": result = va1 - va2;
			break;
		case"*": result = va1 * va2;
			break;
		case"/": result = va1 / va2;
		if(va2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return; 
		}else {
			result = va1 / va2;
		}
			break;
		default: System.out.println("������ ����!");
		}//switch
		System.out.printf("%.2f %s %.2f = %.2f",va1, operator, va2, result);
	}//main

}
