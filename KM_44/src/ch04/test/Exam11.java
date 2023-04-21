package ch04.test;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		
		//로컬 변수 (local variable): 메서드 안에 선언되는 변수.
		//로컬 변수는 사용하기 전에 반드시 초기화가 되어있어야 한다.
		//따라서 선언과 동시에 기본 값으로 초기화를 한다.
		//메서드 밖 클래스 안 : 멤버 변수.
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d년 %d월은 31일 까지 있습니다.",year, month);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d년 %d월은 30일 까지 있습니다.",year, month);
			break;
		case 2:
			if((year%4 == 0 && year%100 != 0) || (year % 400 == 0))
			{
				System.out.printf("%d년 %d월은 29일 까지 있습니다.",year, month);
			}
			else {
				System.out.printf("%d년 %d월은 28일 까지 있습니다.",year, month);
			}
			break;
		default:
			System.out.println("원하시는 년도와 월을 쓰세요.");
			break; //맨 밑에 있을꺼면 break 안써도 되지만 난 
		}//out of switch.
		
	}//out of main.
}//out of class.
