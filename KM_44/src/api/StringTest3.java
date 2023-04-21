package api;

import java.util.Scanner;

/*
 * 주민등록번호 입력받아 검중하고 결과 출력
 * "990101-1234567" 형태로 입력
 * [결과]
 * - 입력오류
 * 또는
 * - 99년 01월 01생 남자입니다.
 */
public class StringTest3 {

	public static void main(String[] args) {
		System.out.println("주민등록 번호 입력:");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		
		if(14<code.length()) {
			System.out.println("주민등록 번호수가 너무 많습니다.");
			return ;
		}
		System.out.println(code.length());
		if(14>code.length()) {
			System.out.println("숫자가 충분치 않습니다.");
		}
		if(code.charAt(6) != '-') {
			System.out.println("6번째 숫자에 '-'를 안쳤습니다.");
		}
		if(code.length()==14) 
		{
			if(code.charAt(7) == '1'){
				System.out.print(code.substring(0,2));
				System.out.print("년"+ code.substring(2,4)+"월");
				System.out.print(code.substring(4,6)+"생 남자입니다.");
				}
			else if(code.charAt(7) == '2') {
				System.out.print(code.substring(0,2));
				System.out.print("년"+ code.substring(2,4)+"월");
				System.out.print(code.substring(4,6)+"생 여자입니다.");
				}
		}
		
	}

}
