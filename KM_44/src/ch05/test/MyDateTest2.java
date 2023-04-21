package ch05.test;

public class MyDateTest2 {
	public static void main(String[] args) {
		MyDate2 date = new MyDate2(2023, 4, 12);
		
		if(date.isValid()) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}//main
}//class
