package api;

import java.util.Scanner;

//java.lang.string 테스트
public class StringTest1 {
	public static void main(String[] args) {
		String a;
		String b = null;
		String c = "";
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		String g = new String("abc");
		
		//System.out.println(a); 초기화 되지 않은 상태
		//문자열 내용은 객체로 힙 영역에 저장되어있다.
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(d == e);
		System.out.println(d.equals(e));
		System.out.println(e);
		//stack에 들어있는 주소값이 다르니까 false
		System.out.println(f == g);
		//equals 메소드 :주솟값 같은지가 아닌 내용비교
		System.out.println(f.equals(g));
		System.out.println(f.equals("abc"));		
		System.out.println(f.equals("ABC"));
		System.out.println(f.equalsIgnoreCase("ABC"));
		
		//string객체.메서드 호출
		String s = "abcdefg";
		System.out.println(s.length()); //문자열의 길이
		System.out.println(s.charAt(0)); //1문자 읽기
		System.out.println(s.substring(3,6)); //부분문자열 읽기
		System.out.println(s.substring(4)); //불러온 숫자부터 끝까지
		System.out.println(s.substring(2,5).length());
		System.out.println(s.substring(s.length() - 1));
		System.out.println();
		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf("de")); //-1이면 못찾은것.
		//de 해서 3이 나오는 이유는 단어의 첫번쨰 숫자를 찾는거라서
		System.out.println();
		System.out.println(s.contains("def"));
		System.out.println(s.compareTo("abd")); //99-100 숫자정렬
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//특정문자를 뒤에서부터 찾기
		//"abc"로 시작하는가?
		System.out.println();
		
		s = "a";
		s = s + "b";
		s = s + "c";
		System.out.println(s);
		s = "010-1111-2222";
		String s2 = s.replaceAll("-", "/");
		System.out.println(s2);
		String s3[] = s.split("-");
		System.out.println(s3[0] + s3[1] + s3[2]);
		//"fg"로 끝나는가?
		System.out.println('g');
		System.out.println("a".compareTo("aaa"));
	
		
	}
	
}
