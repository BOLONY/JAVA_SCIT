package ch04.test;

import java.util.Scanner;

public class AnswerQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 �Է�: ");
		double va1 = sc.nextDouble();
		System.out.print("��2 �Է�: ");
		double va2 = sc.nextDouble();
		System.out.print("������ �Է�: ");
		String operator = sc.next();
		
		//flag����. �и� 0�̸� ��� �Ұ����� �Ǻ�.
//		boolean is_print = true;
		
		double result = 0.0;
		//��ü�� ���� ���� ���� equals() �޼��带 ����Ѵ�.
		//String�� ������ ������Ÿ��
		if(operator.equals("+")) {
			result = va1 + va2;
		}else if(operator.equals("-")) {
			result = va1 - va2;
		}else if(operator.equals("*")) {
			result = va1 * va2;
		}else if(operator.equals("/")) {
			if(va2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
//				is_print = false;
				return; //�� �޼����� ������ ���⼭ �ߴ��϶�.
			}else {
				result = va1 / va2;
			}                       
		}else {
			System.out.println("������ ����!");
		}
		
//		if(is_print) System.out.printf("%.2f %s %.2f = %.2f",va1, operator, va2, result);
		System.out.printf("%.2f %s %.2f = %.2f",va1, operator, va2, result);
	}//end of main

}

//ret
