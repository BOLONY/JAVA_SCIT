package ch05.test;

public class MyDateTest3 {
	public static void main(String[] args) {
		MyDate3 number = new MyDate3(2023, 4, 20);
		
		if(number.isValid()) {
			System.out.println("��ȿ�� ��¯�Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
		
	}//main
}//class
