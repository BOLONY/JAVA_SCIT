package ch04.test;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0 �ٸ� ��ȣ �Է�.");
			return; //����Ұ� ������.void �ϱ� return ����.
		}
		
		   
		if(num %2 ==0) System.out.println("¦���Դϴ�.");
		else System.out.println("Ȧ���Դϴ�.");
		
	}

}
