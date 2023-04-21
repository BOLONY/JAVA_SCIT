package ch05.test;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate(4, 20, 2023);
	
		if (date.isValid()) {
				System.out.println("유효한 날짜입니다.");
			}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
			}
		}//main

}//Class