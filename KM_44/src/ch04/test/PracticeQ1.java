package ch04.test;

import java.util.Scanner;

public class PracticeQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �����Է�: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �����Է�: ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է�: ");
		char cal = sc.next().charAt(0); 
		
		int result = 0;
		
		switch(cal) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		}//end of switch
		
		System.out.printf("%d %s %d = %d",num1, cal, num2, result);
	}//end of main
}//end of class
