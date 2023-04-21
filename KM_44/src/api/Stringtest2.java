package api;

import java.util.Scanner;
//키보드로 부터 문자열을 입력받아 출력. 거꾸로 다시 출력
// abc -> cba

public class Stringtest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		System.out.println("문자열을 입력하세요");
		s = sc.nextLine();
		System.out.println(s);
		System.out.println();
		
		int num  = s.length() - 1;
		while (num>=0) {
			System.out.print(s.charAt(num));
			num --;
		}
		System.out.println();
		for (int i = s.length()-1; i>= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
	
		String a = new  String ();
		StringBuffer b = new StringBuffer();
		
		a = a+ "a";
		a = a.concat("b");
		
		b.append("a");
		b.append(1);
		
		System.out.println(b.toString());
	}
}
