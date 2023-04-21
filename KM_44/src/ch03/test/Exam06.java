package ch03.test;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int hour = 0;
		int sec2 = 0;
		System.out.print("시간을 초 단위로 입력하세요 : ");
		int sec = sc.nextInt();
		
		sec2 = sec%60;
//		min = (sec/60)%60;
		min = (sec%3600)/60;
		hour = sec/3600; // 맞음
		 
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", sec, hour, min, sec2);
	
	}
}
