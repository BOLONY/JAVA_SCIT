package ch04.test;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMainMenu();
			System.out.print("��ȣ ����: ");
			int num = sc.nextInt();
			
			label1:
			switch(num) {
			case 1: System.out.println("\"1. ��ü ���� ����\" �޴��� �����߽��ϴ�.");
			break;
			case 2: System.out.println("\"2. ����");
			break;
			case 3: System.out.println("\"2. ����");
			break;
			case 4: System.out.println("\"2. ����");
			break;
			case 5: System.out.println("\"2. ����");
			break;
			case 6: System.out.println("\"2. ����");
			break;
			case 7: System.out.println("\"2. ����");
			break;
			case 8: System.out.println("\"2. ����");
			break;
			case 9: System.out.println("\"2. ����");
			break;
			case 0: System.exit(0);//�ƿ� â �ݱ�
			default: System.out.println("���� ��ȣ�Դϴ�...");
			break label1;
			}//switch
		}//while
	}//main
	
	private static void printMainMenu() {
		System.out.println("[���� ����]");
		System.out.println("1. ��ü ���� ����");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� ����");
		System.out.println("0. ����");
	}//printMainMenu
}//class
