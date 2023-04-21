package ch04.test;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 해를 입력하세요 : ");
		int year = sc.nextInt();
		int animal = (year - 3) % 12;
		String name = null;
//		String name = "" 
		
		switch(animal) {
		case 1: name = "쥐"; break;
		case 2: name = "소"; break;
		case 3: name = "호랑이"; break;
		case 4: name = "토끼"; break;
		case 5: name = "용"; break;
		case 6: name = "뱀"; break;
		case 7: name = "말"; break;
		case 8: name = "양"; break;
		case 9: name = "원숭이"; break;
		case 10: name = "닭"; break;
		case 11: name = "개"; break;
		case 0: name = "돼지"; break;
		}//out of switch
		
		System.out.printf("%d년생은 %s띠 입니다.",year, name);
	}

}
