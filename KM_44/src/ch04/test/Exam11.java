package ch04.test;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		int month = sc.nextInt();
		
		//���� ���� (local variable): �޼��� �ȿ� ����Ǵ� ����.
		//���� ������ ����ϱ� ���� �ݵ�� �ʱ�ȭ�� �Ǿ��־�� �Ѵ�.
		//���� ����� ���ÿ� �⺻ ������ �ʱ�ȭ�� �Ѵ�.
		//�޼��� �� Ŭ���� �� : ��� ����.
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d�� %d���� 31�� ���� �ֽ��ϴ�.",year, month);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d�� %d���� 30�� ���� �ֽ��ϴ�.",year, month);
			break;
		case 2:
			if((year%4 == 0 && year%100 != 0) || (year % 400 == 0))
			{
				System.out.printf("%d�� %d���� 29�� ���� �ֽ��ϴ�.",year, month);
			}
			else {
				System.out.printf("%d�� %d���� 28�� ���� �ֽ��ϴ�.",year, month);
			}
			break;
		default:
			System.out.println("���Ͻô� �⵵�� ���� ������.");
			break; //�� �ؿ� �������� break �Ƚᵵ ������ �� 
		}//out of switch.
		
	}//out of main.
}//out of class.
