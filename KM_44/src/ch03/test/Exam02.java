package ch03.test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner exam02 = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = exam02.nextLine();
		//scanner 문자열 넣는거 next nextline
		//공백을 포함한 문자열을 넣을땐 nextLine
		System.out.print("나이는: ");
		int age = exam02.nextInt();
		System.out.print("키는: ");
		float height = exam02.nextFloat();
		
		System.out.println("이름은 "+name+"이고 나이는"+age+"세, 키는"+height+ "cm입니다.");
		//%s %d %f 문자열 정수 실수
		System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.2fcm입니다.", name, age, height);
		
		
	}

}
