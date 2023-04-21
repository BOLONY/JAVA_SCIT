package api;

import java.util.Scanner;

public class StringTest3Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = null;
		
		System.out.println("주민등록번호(000000-0000000)");
		num = sc.nextLine();
		
		if(num.length() != 14) {
			System.out.println("입력 오류"); //오류 메시지 출력하고 리턴
			return;
		}
		
		if(num.indexOf('-') != 6) {
			//if (num.charAt(6) != '-')
			// if (!num.subString(6,7).equals("-"))
			System.out.println("입력 오류");
			return;
		}
		
		char ch = num.charAt(7);
		/*if(ch != '1' && ch != '2' && ch != '3' && ch!= '4' ) {*/
		if(ch < '1' || ch >'4') {
			System.out.println("입력 오류");
			return;
		}
		//결과출력
		String y = num.substring(0,2);
		
		//성별
		String s = ch == '1' || ch =='3' ? "남자" : "여자";
	}

}
