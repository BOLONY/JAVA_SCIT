package ch05.test;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate(4, 20, 2023);
	
		if (date.isValid()) {
				System.out.println("��ȿ�� ��¥�Դϴ�.");
			}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
			}
		}//main

}//Class