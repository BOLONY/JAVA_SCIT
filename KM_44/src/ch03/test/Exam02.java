package ch03.test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner exam02 = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = exam02.nextLine();
		//scanner ���ڿ� �ִ°� next nextline
		//������ ������ ���ڿ��� ������ nextLine
		System.out.print("���̴�: ");
		int age = exam02.nextInt();
		System.out.print("Ű��: ");
		float height = exam02.nextFloat();
		
		System.out.println("�̸��� "+name+"�̰� ���̴�"+age+"��, Ű��"+height+ "cm�Դϴ�.");
		//%s %d %f ���ڿ� ���� �Ǽ�
		System.out.printf("�̸��� %s�̰� ���̴� %d��, Ű�� %.2fcm�Դϴ�.", name, age, height);
		
		
	}

}
