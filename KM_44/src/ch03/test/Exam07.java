package ch03.test;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ������ = 0;
		int ���� = 0;
		int ��õ�� = 0;
		int õ�� = 0;
		int ������ = 0;
		
		System.out.println("��ǰ������ �Է��ϼ��� : ");
		int price = sc.nextInt();
		
		������ = price / 50000;
		���� = (price%50000)/10000;
		��õ�� = (price%10000)/5000;
		õ�� = (price%5000)/1000;
		������ = price%1000;
		
		System.out.printf("%d���� 5������ %d��, ������ %d��, 5õ���� %d��, õ���� %d���� �����ϰ� %d���� �����ϴ�.",price, ������, ����, ��õ��, õ��, ������);
		
		
	}

}
