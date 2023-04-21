package ch03.test;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int 오만원 = 0;
		int 만원 = 0;
		int 오천원 = 0;
		int 천원 = 0;
		int 나머지 = 0;
		
		System.out.println("상품가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		오만원 = price / 50000;
		만원 = (price%50000)/10000;
		오천원 = (price%10000)/5000;
		천원 = (price%5000)/1000;
		나머지 = price%1000;
		
		System.out.printf("%d원은 5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다.",price, 오만원, 만원, 오천원, 천원, 나머지);
		
		
	}

}
