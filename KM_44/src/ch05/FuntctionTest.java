package ch05;

import java.util.Scanner;

public class FuntctionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 20;
		
		FuntctionTest t = new FuntctionTest();//�� ����ƽ �Լ��� ����� ��ü �����ϰ� ������ ��ü ȣ��.
		//���� �Ϲ����� ������� ���� �ö�. ����ϱ� ������ ��ü�� �����Ǹ�ȴ�.
		int sum = t.add(num1, num2);
		System.out.println(num1 + "+" + num2 + " = " + sum + "�Դϴ�.");
	}
	 
	public int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

}
