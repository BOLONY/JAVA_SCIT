package ch03.test;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int hour = 0;
		int sec2 = 0;
		System.out.print("�ð��� �� ������ �Է��ϼ��� : ");
		int sec = sc.nextInt();
		
		sec2 = sec%60;
//		min = (sec/60)%60;
		min = (sec%3600)/60;
		hour = sec/3600; // ����
		 
		System.out.printf("%d�ʴ� %d�ð� %d�� %d���Դϴ�.", sec, hour, min, sec2);
	
	}
}
