package ch03.test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.in 은 객체
		System.out.print("국어 점수 : ");
		int korea = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int result = (korea+english+math);
		float average = result/3.0f;
		//.00f .0f 하든 똑같다.
		float average2 = (float)result/3;
		// 이것이 캐스팅
	
		System.out.printf("총점 : %d 평균 : %.2f",result, average);
	}
}
