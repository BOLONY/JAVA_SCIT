package ch03.test;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int subJ1 = sc.nextInt();
		System.out.print("����2 : ");
		int subJ2 = sc.nextInt();
		System.out.print("����3 : ");
		int subJ3 = sc.nextInt();
		
		float average = (subJ1+subJ2+subJ3)/3.0f;
		//�⺻ ����Ʈ�� �����̶� ����d �������.
//		System.out.println("��� : "+average);
		
		
//		String pf = (subJ1>40 && subJ2>40 && subJ3>=40 && average>=60) ? "�հ�":"���հ�";
		String pf = (subJ1>40 && subJ2>40 && subJ3>=40) && (average>=60) ? "�հ�":"���հ�";
//		System.out.println(pf);
		System.out.printf("��� : %.2f \n %s", average, pf);
		
	}
}
