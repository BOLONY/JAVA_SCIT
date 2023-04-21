package ch05.test;

public class MyDateTest3 {
	public static void main(String[] args) {
		MyDate3 number = new MyDate3(2023, 4, 20);
		
		if(number.isValid()) {
			System.out.println("유효한 날짱입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		
	}//main
}//class
