package ch04.test;
import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int number = 0;
		int sum = 0;
		
		while(true) {
			System.out.print("���� �Է� : ");
			int number = sc.nextInt();
			sum = sum + number;
			
			if(number == 0) {
				break;
			}
		}//while
		System.out.printf("�հ� :  %d",sum);
		
	}//main
}
