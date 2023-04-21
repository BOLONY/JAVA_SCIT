package ch04.test;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMainMenu();
			System.out.print("번호 선택: ");
			int num = sc.nextInt();
			
			label1:
			switch(num) {
			case 1: System.out.println("\"1. 전체 일정 보기\" 메뉴를 선택했습니다.");
			break;
			case 2: System.out.println("\"2. 일정");
			break;
			case 3: System.out.println("\"2. 일정");
			break;
			case 4: System.out.println("\"2. 일정");
			break;
			case 5: System.out.println("\"2. 일정");
			break;
			case 6: System.out.println("\"2. 일정");
			break;
			case 7: System.out.println("\"2. 일정");
			break;
			case 8: System.out.println("\"2. 일정");
			break;
			case 9: System.out.println("\"2. 일정");
			break;
			case 0: System.exit(0);//아예 창 닫기
			default: System.out.println("없는 번호입니다...");
			break label1;
			}//switch
		}//while
	}//main
	
	private static void printMainMenu() {
		System.out.println("[일정 관리]");
		System.out.println("1. 전체 일정 보기");
		System.out.println("2. 일정 등록");
		System.out.println("3. 일정 검색");
		System.out.println("4. 일정 삭제");
		System.out.println("0. 종료");
	}//printMainMenu
}//class
