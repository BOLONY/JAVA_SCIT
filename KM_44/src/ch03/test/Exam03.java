package ch03.test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.in �� ��ü
		System.out.print("���� ���� : ");
		int korea = sc.nextInt();
		System.out.print("���� ���� : ");
		int english = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		int result = (korea+english+math);
		float average = result/3.0f;
		//.00f .0f �ϵ� �Ȱ���.
		float average2 = (float)result/3;
		// �̰��� ĳ����
	
		System.out.printf("���� : %d ��� : %.2f",result, average);
	}
}
