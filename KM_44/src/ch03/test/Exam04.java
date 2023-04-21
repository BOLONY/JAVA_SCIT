package ch03.test;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과목1 : ");
		int subJ1 = sc.nextInt();
		System.out.print("과목2 : ");
		int subJ2 = sc.nextInt();
		System.out.print("과목3 : ");
		int subJ3 = sc.nextInt();
		
		float average = (subJ1+subJ2+subJ3)/3.0f;
		//기본 디폴트라 더블이라 숫자d 써줘야함.
//		System.out.println("평균 : "+average);
		
		
//		String pf = (subJ1>40 && subJ2>40 && subJ3>=40 && average>=60) ? "합격":"불합격";
		String pf = (subJ1>40 && subJ2>40 && subJ3>=40) && (average>=60) ? "합격":"불합격";
//		System.out.println(pf);
		System.out.printf("평균 : %.2f \n %s", average, pf);
		
	}
}
