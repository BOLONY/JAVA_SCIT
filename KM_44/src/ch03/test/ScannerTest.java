package ch03.test;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Ű���� �Է� ó��. ǥ���Է� ����
		System.out.print("���� �Է�: ");
		int age = sc.nextInt();
		System.out.println("�Է��� ���̴� " + age + "�� �Դϴ�.");
		
		System.out.print("�̸� �Է�: ");
		String name = sc.next();
		System.out.println("�̸��� "+name+"�Դϴ�.");
		
		System.out.print("�ּ� �Է�: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("�ּҴ� "+address+"�Դϴ�.");
		
		//nextInt �о int�� ��ȯ B-Type. �Ű����� �����ϱ� �ٵ� ����� ó�����ִϱ�
		//�� é�� Ǯ������ ���� Ǭ��.
		//Ű���� �Է� ó��
		//next float, next double, next
		//next��� �޼���� ������ �������� ���´�.
		
	}

}
