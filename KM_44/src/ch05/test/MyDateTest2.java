package ch05.test;

public class MyDateTest2 {
	public static void main(String[] args) {
		MyDate2 date = new MyDate2(2023, 4, 12);
		
		if(date.isValid()) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}//main
}//class
