package ch04.test;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0 다른 번호 입력.");
			return; //출력할게 없으니.void 니까 return 없음.
		}
		
		   
		if(num %2 ==0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
		
	}

}
