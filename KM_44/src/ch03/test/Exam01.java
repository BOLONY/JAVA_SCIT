package ch03.test;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner yas = new Scanner(System.in); 
		//��ü�� �����ؼ� ������ �Ѵ�.
		System.out.print("������ �Է��ϼ���: ");
		int number = yas.nextInt();
		//scanner.nextInt��� �޼��带 �����Ѵ�.
		//int Ÿ�� �������� ���� ������ �ȴ�.
		 
		System.out.println("num �� ��: " + number );
//		if(number>0) {
//			System.out.println("result�� ��: true");
//		}
//		else {
//			System.out.println("result�� ��: false");
//		}
		
//		String result = (number>0) ? "true":"false"; //���� ������
		boolean result = number > 0 ;
		System.out.println("num�� ��: "+number);
		System.out.println("result�� ��: "+result);
//		System.out.println("result�� ��: " + result);
//		string�� none string�� ���ص� ���ڿ��� �ȴ�.
//		"abc"+10 ==> "abc10", 10+10+"abc" => "20abc"
		
	}
}
