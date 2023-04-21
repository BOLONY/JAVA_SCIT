package api;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		double d;
		String s1, s2;
		
		System.out.print("문자열: ");
		s1 = scan.nextLine();
		System.out.print("정수: ");
		i = scan.nextInt();
		System.out.print("실수: ");
		d = scan.nextDouble();
		System.out.println();
		
		//enter 도 char다. \n, 유니코드로 10번 문자가 개행문자.
		//nextLine 은 앞에 있는 enter 가 남아있으면 남아있는 enter를 처리한다.
		System.out.println("문자열: ");
		s2 = scan.nextLine();
		System.out.println("----------------");
		System.out.print(s1 + "," + i + ","+ d + ","+ s2);
		
	}

}
