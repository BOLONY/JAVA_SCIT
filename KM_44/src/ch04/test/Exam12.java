package ch04.test;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �ظ� �Է��ϼ��� : ");
		int year = sc.nextInt();
		int animal = (year - 3) % 12;
		String name = null;
//		String name = "" 
		
		switch(animal) {
		case 1: name = "��"; break;
		case 2: name = "��"; break;
		case 3: name = "ȣ����"; break;
		case 4: name = "�䳢"; break;
		case 5: name = "��"; break;
		case 6: name = "��"; break;
		case 7: name = "��"; break;
		case 8: name = "��"; break;
		case 9: name = "������"; break;
		case 10: name = "��"; break;
		case 11: name = "��"; break;
		case 0: name = "����"; break;
		}//out of switch
		
		System.out.printf("%d����� %s�� �Դϴ�.",year, name);
	}

}
